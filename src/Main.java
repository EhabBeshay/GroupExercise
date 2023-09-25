// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String input = "abracadabra";
        char firstNonRepeating = findFirstNonRepeatingChar(input);

        System.out.println("Input string: " + input);

        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isRepeating = false;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && currentChar == input.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                return currentChar;
            }
        }

        // If no non-repeating character is found, return a default character (e.g., '\0')
        return '\0';
    }

}
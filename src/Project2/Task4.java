package Project2;
/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

 */
public class Task4 {
    public static void main(String[] args) {
        int count =countWords("Hello Java World");
        System.out.println(count);
    }

    public static int countWords(String sentence){
        String[] s = sentence.split(" ");

        return s.length;
    }

}

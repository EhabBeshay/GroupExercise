package Project2;
/*Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.

 */
public class Task3 {
    public static void main(String[] args) {
        String str = "madam";

        boolean isPalindrome = true;

        for (int i = 0, j = str.length()-1; i <  j; i++, j--){
            if (str.charAt(i) == str.charAt(j))
                continue;

            isPalindrome = false;
            break;


        }
        System.out.println(isPalindrome ? "palindrome" : "not Palindrome");
    }

}

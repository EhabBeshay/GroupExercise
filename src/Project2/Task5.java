package Project2;

import java.util.Arrays;

/*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.

 */
public class Task5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagrams = true;


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted strings
         Arrays.equals(charArray1, charArray2);



        System.out.println(isAnagrams ? "Anagrams" : "not Anagrams");


    }

}

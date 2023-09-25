package Project2;
/*
Write a program to swap 2 String without a temporary variable?
 */
public class Task1 {
    public static void main(String[] args) {
        String str1 = "Ehab";
        String str2 = "Beshay";

        System.out.println("Before Swapping =");
        System.out.println("First String is: " + str1);
        System.out.println("Second String is: " +str2);
        System.out.println("========================");
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After Swapping =");
        System.out.println("First String is: " + str1);
        System.out.println("Second String is: " +str2);




    }
}

package Project1;
/*
Write a program to print out duplicate elements from an Array of
Strings?
 */
public class Task10 {
    public static void main(String[] args) {
    String[] fruits = {"Kiwi","Mango","Kiwi","Apple","Peach","Strawberry","Melon","Watermelon","Guava","Orange","melon"};

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i+1; j < fruits.length; j++) {
                if (fruits[i].equalsIgnoreCase(fruits[j])){
                    System.out.println("Duplicate fruit is: " + fruits[i]);
                }

            }

        }
    }

}

package Project1;
/*Create an array of integer values. After the array is created, calculate
the sum of all stored elements in that array.

 */
public class task2 {
    public static void main(String[] args) {
        int[] numbers = {75, 85, 95, 105, 115, 125, 135};

        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum +=numbers[i];

        }
        System.out.println("Sum of array elements is:  " + sum);
    }
}

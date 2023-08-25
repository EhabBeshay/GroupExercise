package Project1;
/*
Create a 2D array of integers. Develop a program which will calculate
the sum of even and odd numbers for that array.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2 , 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14}
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <  numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0){
                    sumEven += numbers[i][j];
                }
                if (numbers[i][j] % 2 != 0){
                    sumOdd += numbers[i][j];
                }

            }
            
        }
        System.out.println("Sum of even numbers is: " + sumEven);
        System.out.println("Sum of odd numbers is: " + sumOdd);


    }
}

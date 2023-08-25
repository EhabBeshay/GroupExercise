package Project1;
/*
Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
public class Task7 {
    public static void main(String[] args) {
        int n = 10; // Number of terms to be printed
        int F1 = 0, F2 = 1;

        System.out.println("First " + n + " numbers of Fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(F1 + " ");
            int next = F1 + F2;
            F1 = F2;
            F2 = next;
        }

    }
}

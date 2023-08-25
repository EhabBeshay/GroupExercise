package Project1;

import java.util.Scanner;

/*
Write a java program to check whether a given number is prime or
not?

 */
public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        boolean isPrime=true;
        for (int i = 2; i <= n/2 ; i++)
            if (n % i == 0){
                isPrime = false;
                break;
            }
        System.out.println(isPrime ? "prime" : "not prime");

    }
}

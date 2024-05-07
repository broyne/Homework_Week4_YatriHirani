package homework_week_4;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12 {
    //Declare main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close(); //Close scanner
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            // Numbers less than or equal to 1 are not prime
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                // If a factor is found, the number is not prime than return false
                return false;
            }
        }
        // If no factors are found, the number is prime
        return true;
    }


}

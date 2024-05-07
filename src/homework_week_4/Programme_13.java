package homework_week_4;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13 {
    //Declare main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Second number: ");
        int number2 = scanner.nextInt();
        System.out.println(hasSharedDigit(number1, number2));
        scanner.close(); //Close scanner
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (!isValid(num1) || !isValid(num2)) {
            return false; // Check if both numbers are within the range
        }

        int tempNum1 = num1;
        while (tempNum1 > 0) {
            int digit1 = tempNum1 % 10;
            int tempNum2 = num2;
            while (tempNum2 > 0) {
                int digit2 = tempNum2 % 10;
                if (digit1 == digit2) {
                    // If a shared digit is found, return true
                    return true;
                }
                tempNum2 /= 10;
            }
            tempNum1 /= 10;
        }
        return false; // If no shared digit is found, return false
    }
//Declare static method with variable
    public static boolean isValid(int number) {
        // Check if the number is within the range
        return number >= 10 && number <= 99;
    }
}




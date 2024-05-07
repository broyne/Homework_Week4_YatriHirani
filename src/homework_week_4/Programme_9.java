package homework_week_4;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9 {

    //Declare main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the end value to get the Fibonacci number");
        int number = scanner.nextInt();
        fibonnacciNumber(number); //Called Static method in main method
        scanner.close(); //Close scanner
    }

    //Create static method
    public static void fibonnacciNumber(int len) {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdnumber;

        for (int i = 1; i <= len; i++) {
            System.out.print(firstNumber + " ");
            //Swap number to get the numbers
            thirdnumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdnumber;
        }
    }
}

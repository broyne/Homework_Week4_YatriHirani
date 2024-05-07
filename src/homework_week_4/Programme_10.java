package homework_week_4;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10 {
    //Declare main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        armstrongNumber(number); //Called method in main method
        scanner.close(); //Close scanner
    }

    //Create static method
    public static void armstrongNumber(int number) {

        int mmainNumber, remainder, result = 0, digits = 0;
        mmainNumber = number;

        // Count number of digits
        while (mmainNumber != 0) {
            mmainNumber /= 10;
            ++digits;
        }

        mmainNumber = number;

        // Calculate Armstrong number
        while (mmainNumber != 0) {
            remainder = mmainNumber % 10;
            result += Math.pow(remainder, digits);
            mmainNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}


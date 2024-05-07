package homework_week_4;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6 {
    //Declare main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme_6 obj = new Programme_6(); //Create object
        System.out.println("Please enter number of rows:");
        int number = scanner.nextInt();
        obj.displayTriangle(number); //Called instance method
        scanner.close(); //Close scanner
    }

    //Declare method with variable
    public void displayTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


}

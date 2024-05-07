package homework_week_4;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */
public class Programme_1_ReadingUserInputChallenge {
    //Declare main method
    public static void main(String[] args) {
        //create object
        Programme_1_ReadingUserInputChallenge obj = new Programme_1_ReadingUserInputChallenge();
        obj.hasNextInt();
        obj.nextInt();
    }

    // Create hasNextInt() method
    public void hasNextInt() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (count < 10) {
            int numorder = count + 1;
            System.out.print("Enter number #" + numorder + ": ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                sum += num;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of the 10 numbers is: " + sum);
        //Close scanner
        scanner.close();

    }

    public void nextInt() {
        Scanner scanner = new Scanner(System.in);

    }


}





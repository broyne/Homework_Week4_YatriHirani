package homework_week_4;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8 {

    //Declare main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your character");
        Character a = scan.nextLine().charAt(0);

        System.out.println("Enter the leangh for triangle");
        int b = scan.nextInt();
        // called method to display triangle
        display(a, b);
        scan.close(); //Closed scan
    }

    // Declare method for triangle
    public static void display(char a, int len) {
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j < i + 1; j++) {

                System.out.print(a);
            }
            System.out.println("Not valid");
        }
    }


}

package javaprogrammes;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum
 * number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum
 * and maximum number.
 */
public class MinAndMaxInputChallenge {
    public static void findMinAndMax() {
        Scanner s = new Scanner(System.in);
        int min = 0, max = 0;

        boolean first = true;
        //while loop
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = s.hasNextInt();
            if (isAnInt) {
                int number = s.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            s.nextLine();
        }
        System.out.println("Min = " + min + " , Max = " + max);
        s.close();
    }

    public static void main(String[] args) {
        findMinAndMax();
    }
}

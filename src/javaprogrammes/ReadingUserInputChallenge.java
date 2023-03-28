package javaprogrammes;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have
 * read 10 numbers.
 * Use the nextInt() method to get the number and add it to the sum.
 * Before the user enters each number, print the message Enter number #x: where x
 * represents the count, i.e. 1, 2, 3, 4, etc.
 * For example, the first message printed to the user would Enter number #1:, the next Enter number  #2:, and so on.
 */
public class ReadingUserInputChallenge {
    public boolean sumUserInputNumber() {
        //Scanner declaration
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        //while loop
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean number = sc.hasNextInt();
            if (number) {
                int num = sc.nextInt();
                sum = sum + num;
                counter++;
            } else {
                System.out.println("Invalid number");
                break;
            }
        }
        //closing the scanner
        sc.close();
        System.out.println("Sum of entered numbers: " + sum);
        return false;
    }

    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.sumUserInputNumber();
    }
}

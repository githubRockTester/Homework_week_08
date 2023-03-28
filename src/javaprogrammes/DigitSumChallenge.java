package javaprogrammes;

import java.util.Scanner;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all
 * digits,  otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to
 * process negative numbers, so also return -1 for negative numbers.
 */
public class DigitSumChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int n = input.nextInt();
        System.out.print("The sum of the digit is: " + sumDigits(n));
        input.close();
    }

    public static int sumDigits(int n) {
        int result = 0;
        if (n < 10) {
            result = -1;
        } else {
            while (n > 0) {
                result += n % 10;
                n /= 10;
            }
        }
        return result;
    }
}

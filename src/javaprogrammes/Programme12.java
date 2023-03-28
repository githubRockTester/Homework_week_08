package javaprogrammes;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */
public class Programme12 {
    public static void checkNumber() {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        a = sc.nextInt();
        sc.close();

        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    b++;
            }
            if (b == 2) {
                System.out.println("Number is PrimeNumber");
            } else {
                System.out.println("Number is not PrimeNumber");
            }
        }
    }

    public static void main(String[] args) {
        checkNumber();
    }
}

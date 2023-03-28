package javaprogrammes;

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
public class Programme10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input any number");
        int n = scn.nextInt();
        scn.close();

        int temp = n;
        int p = 0;

        //function to calculate the sum of individual digits

        while (n > 0) {
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        if (temp == p) {
            System.out.println(n + " is Armstrong No.");
        } else {
            System.out.println(n + " is not an Armstrong No.");
        }
    }
}

package javaprogrammes;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme15 {
    public static void main(String[] args) {
        leftTriangle();
    }

    public static void leftTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows:");
        int r = input.nextInt();
        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        input.close();
    }
}

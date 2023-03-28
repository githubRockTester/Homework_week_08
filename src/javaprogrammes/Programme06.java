package javaprogrammes;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number. For eg.
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
public class Programme06 {
    public static void main(String[] args) {
        int b, c, a;                            // Declared integers
        Scanner s = new Scanner(System.in);     // Scanner declared
        System.out.print("Enter Input: ");
        a = s.nextInt();
        s.close();                              // Closing scanner

        for (b = 1; b <= a; b++) {              // forloop for rows
            for (c = 1; c <= b; c++) {          // forloop for column
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}

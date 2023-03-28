package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input Is not a letter
 * (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide single alphabet character: ");
        String alp = s.next().toLowerCase();

        boolean uppercase = alp.charAt(0) >= 65 && alp.charAt(0) <= 90;     // uppercase
        boolean lowercase = alp.charAt(0) >= 97 && alp.charAt(0) <= 122;    // lowercase
        boolean vowels = alp.equals("a") || alp.equals("e") || alp.equals("i") // define vowels
                || alp.equals("o") || alp.equals("u");
        s.close();

        if (alp.length() > 1) {                                 // condition for length
            System.out.println("Not a single character.");
        } else if (!(uppercase || lowercase)) {                 // Condition for upper/lower case
            System.out.println("Not a letter, Enter uppercase or lowercase letter.");
        } else if (vowels) {                                    // condition for vowels
            System.out.println("Input letter is Vowel");
        } else {                                                // rest is consonant
            System.out.println("Input letter is Consonant");
        }
    }
}
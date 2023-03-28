package javaprogrammes;

/**
 * Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 */
public class Programme05 {
    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }

    public static boolean isPalindrome(int number) {
        int x = number;
        int rev = 0;
        boolean res = false;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
            if (x == rev)
                res = true;
        }
        System.out.println(rev + " " + res);
        return false;
    }
}

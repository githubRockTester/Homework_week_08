package javaprogrammes;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid
 */
public class Programme11 {
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number) {
        // int res = 0;
        if (number < 0) {
            System.out.println("return -1");
            return -1;
        }
        int lastDigit = 0;
        int evenDigitSum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            number = number / 10;
            //   System.out.println(evenDigitSum);
        }
        System.out.println(evenDigitSum);
        return evenDigitSum;
    }
}

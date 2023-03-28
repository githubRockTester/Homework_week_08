package javaprogrammes;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme09 {
    public static void main(String[] args) {
        isFibonacci(15);          //length of fibonacci number to print
    }

    public static void isFibonacci(int num) {
        int n1 = 0, n2 = 1, n3;

        for (int i = 2; i < num; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

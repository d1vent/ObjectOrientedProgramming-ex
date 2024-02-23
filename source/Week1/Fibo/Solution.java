package Week1.Fibo;

import java.util.Scanner;

/**
 * tim day so fibo.
 */
// Import your library
// Do not change the name of the Solution class
public class Solution {

    /**
     * ham fib.
     * @param n gia tri
     * @return tra ve ket qua day fib
     */
    public static long fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        for (int i = 1; i < n; i++) {
            f1 += f0;
            f0 = f1 - f0;
            if (f1 > Long.MAX_VALUE || f1 < 0) {
                return Long.MAX_VALUE;
            }
        }
        return f1;
    }

    /**
     * ham main.
     * @param args return fib
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println(fibonacci(n));
    }
}
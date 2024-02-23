package Week1.isPrime;

import java.util.Scanner;

/**
 * kiem tra so nguyen to.
 */
// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * main function.
     * @param args run method to check prime number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isPrime(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
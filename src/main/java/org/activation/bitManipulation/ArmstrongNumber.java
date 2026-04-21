package org.activation.bitManipulation;

public class ArmstrongNumber {

    // Check if a number is an Armstrong number (narcissistic number)
    public static boolean isArmstrong(int n) {
        if (n < 0) return false; // define negative numbers as non-Armstrong

        int original = n;
        int count = countDigit(n);
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += intPow(rem, count);
            n /= 10;
        }

        return sum == original;
    }

    // integer exponentiation (avoid Math.pow double inaccuracies)
    private static int intPow(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    private static int countDigit(int num) {
        if (num == 0) return 1; // 0 has 1 digit
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // If args provided, parse them as ints and test; otherwise run a small default set
        int[] tests;
        if (args != null && args.length > 0) {
            tests = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                try {
                    tests[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid integer argument: " + args[i] + ", treating as 0");
                    tests[i] = 0;
                }
            }
        } else {
            tests = new int[]{0, 1, 2, 153, 370, 371, 407, 1634, 9474, 9475};
        }

        for (int t : tests) {
            System.out.printf("%d -> isArmstrong: %b%n", t, isArmstrong(t));
        }
    }
}

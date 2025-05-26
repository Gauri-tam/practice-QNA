package org.activation.recursion;

public class BaseCondition {

    public static void main(String[] args) {
        BaseCondition baseCondition = new BaseCondition();
        int n = 0; // Example number
        if (baseCondition.isBaseConditionMet(n)) {
            System.out.println("Base condition met for n = " + n);
        } else {
            System.out.println("Base condition not met for n = " + n);
        }
    }
    /**
     * Checks if the base condition is met.
     *
     * @param n the number to check
     * @return true if the base condition is met, false otherwise
     */
    public boolean isBaseConditionMet(int n) {
        return n <= 1;
    }
}

package com.in28minutes.exercises.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
        System.out.printf("Principal: %s, interest: %s%n", calculator.getPrincipal().toString(), calculator.getInterest().toString());
        BigDecimal totalValue = calculator.calculateTotalValue(5); //5 years
        System.out.println(totalValue);
    }

    /**
     * Class that calculates a total value from a principal amount (loan or credit)
     * given an interest and a total duration of years.
     */
    static class SimpleInterestCalculator {
        private final BigDecimal principal;
        private final BigDecimal interest;

        public SimpleInterestCalculator(String principal, String interest) {
            this.principal = new BigDecimal(principal);
            this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
        }

        /**
         * Calculates a total value total duration of years.
         * @param years the total years for the calculation.
         * @return the total value to be paid given the principal and interest.
         */
        public BigDecimal calculateTotalValue(int years) {
            return principal.add(principal.multiply(interest).multiply(new BigDecimal(years)));
        }

        public BigDecimal getPrincipal() {
            return principal;
        }

        public BigDecimal getInterest() {
            return interest;
        }
    }
}



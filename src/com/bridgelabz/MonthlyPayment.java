package com.bridgelabz;

public class MonthlyPayment {

    static void payment() {

        String[] args = new String[0];
        double principal = Double.parseDouble(args[0]);          // Principal Amount.
        double years = Double.parseDouble(args[1]);              // Years.
        double rate = Double.parseDouble(args[2]);               // Rate of Interest.
        double r = rate / (12*100);
        double n = 12 * years;
        double x = Math.pow((1 + r), -n);
        double payments = ((principal * r) / 1 - (x));
        System.out.println("Monthly payment is: " + payments);
    }

    public static void main(String[] args) {
        MonthlyPayment.payment();
    }
}

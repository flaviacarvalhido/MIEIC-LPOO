package com.aor.refactoring.example3;

public abstract class Discount {     //makes no sense, create new class for fixed and another for percentage discount that extend this one
    //private final int fixed;
    //private final double percentage;

    /*
    public Discount(int fixed) {
        this.fixed = fixed;
        this.percentage = 0;
    }

    public Discount(double percentage) {
        this.percentage = percentage;
        this.fixed = 0;
    }
    */
    public abstract double applyDiscount(double price);
        /*
        double discountedPrice = price;

        if (fixed > 0) discountedPrice = fixed > price ? 0 : price - fixed;
        else if (percentage > 0) discountedPrice = price - price * percentage;
        else discountedPrice = price;

        return discountedPrice;

         */

}

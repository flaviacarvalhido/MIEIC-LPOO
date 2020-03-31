package com.aor.refactoring.example3;

public class DiscountFixed extends Discount {

    private int fixed;

    DiscountFixed(int f){
        this.fixed=f;
    }


    @Override
    public double applyDiscount(double price) {
        return price-fixed;
    }
}

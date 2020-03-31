package com.aor.refactoring.example3;

public class DiscountPercentage extends Discount {

    private double percentage;

    DiscountPercentage(double p){
        this.percentage=p;
    }


    @Override
    public double applyDiscount(double price) {
        return price-price*percentage;
    }
}

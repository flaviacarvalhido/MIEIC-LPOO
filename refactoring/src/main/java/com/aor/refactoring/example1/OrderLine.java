package com.aor.refactoring.example1;

public class OrderLine {        //took out the product class usages and overide the toString method to print

    //public Product product;

    public String pName;
    public double price;
    public int quantity;

    public OrderLine(String name, double price, int quantity) {
        this.pName = name;
        this.price = price;
        this.quantity = quantity;
    }

    //very important to solve Feature Envy in order
    @Override
    public String toString() {
        return pName + "(x" + quantity + "): " + (price * quantity) + "\n";
    }

    public double getTotal() {
        return price*quantity;
    }

}

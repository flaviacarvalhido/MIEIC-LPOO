package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {        //too many responsibilities! changed printing responsibility to orderprinter! added getTotal method to avoid repeated code
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public void add(String n, double p, int quantity) {
        lines.add(new OrderLine(n, p , quantity));
    }

    public boolean isElegibleForFreeDelivery() {
        double total = getTotal();

        if (total > 100) {
            return true;
        } else return false;
    }

    public double getTotal(){
        double total=0;

        for (OrderLine line : getLines()) {
            total += line.getTotal();
        }

        return total;
    }

    /*
    public String printOrder() {        //complex function!
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line.product.getName() + "(x" + line.quantity + "): " + (line.product.getPrice() * line.quantity) + "\n");

        double total = 0;

        for (OrderLine line : lines)
            total += line.product.getPrice() * line.quantity;

        printBuffer.append("Total: " + total);

        return printBuffer.toString();
    }
     */
}
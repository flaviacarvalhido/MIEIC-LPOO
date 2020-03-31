package com.aor.refactoring.example1;

public class OrderPrinter{

    private Order o;

    OrderPrinter(Order o){this.o =o;}

    public String printOrder() {        //simple printing function!!
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : o.getLines()) {
            printBuffer.append(line.toString());
        }

        printBuffer.append("Total: " + o.getTotal());

        return printBuffer.toString();
    }



}

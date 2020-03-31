package com.aor.refactoring.example1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    private Order getSmallOrder() {
        Order order = new Order();
        order.add("Lollipop", 5, 10);

        return order;
    }

    private Order getLargeOrder() {
        Order order = new Order();
        order.add("Playstation 4", 400, 2);
        order.add("Red Dead Redemption 2", 50, 1);

        return order;
    }

    @Test
    public void isElegibleForFreeDelivery() {
        assertFalse(getSmallOrder().isElegibleForFreeDelivery());
        assertTrue(getLargeOrder().isElegibleForFreeDelivery());
    }

    @Test
    public void printOrder() {
        String printed = new OrderPrinter(getLargeOrder()).printOrder();
        assertEquals(
                "Playstation 4(x2): 800.0\n" +
                        "Red Dead Redemption 2(x1): 50.0\n" +
                        "Total: 850.0", printed);
    }
}
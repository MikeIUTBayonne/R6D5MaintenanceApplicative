package org.example;

public class ChildrenFeeStrategy {
    private static final double CHILD_PRICE_BASE = 100;

    static double calculate(Visitor visitor, TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.2;
        } else if (TicketType.FULL_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.5;
        }
        return 0;
    }
}
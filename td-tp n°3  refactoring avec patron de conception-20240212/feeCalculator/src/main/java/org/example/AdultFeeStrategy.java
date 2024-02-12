package org.example;

public class AdultFeeStrategy {
    static final double ADULT_PRICE_BASE = 100;

    static double calculate(Visitor visitor, TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return ADULT_PRICE_BASE * 0.6;
        } else if (TicketType.FULL_DAY == ticketType) {
            return ADULT_PRICE_BASE * 1.2;
        }
        return 0;
    }
}
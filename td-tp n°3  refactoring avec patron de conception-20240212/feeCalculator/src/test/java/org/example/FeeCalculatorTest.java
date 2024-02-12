package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeeCalculatorTest {


    @Test
    void calculateFeeAdulteJourMoitie() {
        Visitor adulteTestJourMoitie = new Visitor(20);
        double expected = 60;
        assertEquals(expected,FeeCalculator.calculateFee(adulteTestJourMoitie,TicketType.HALF_DAY));
    }

    @Test
    void calculateFeeAdulteJourComplet() {
        Visitor adulteTestJourComplet = new Visitor(30);
        double expected = 120;
        assertEquals(expected,FeeCalculator.calculateFee(adulteTestJourComplet,TicketType.FULL_DAY));
    }

    @Test
    void calculateFeeEnfantJourMoitie() {
        Visitor enfantTestJourMoitie = new Visitor(14);
        double expected = 20;
        assertEquals(expected,FeeCalculator.calculateFee(enfantTestJourMoitie,TicketType.HALF_DAY));
    }

    @Test
    void calculateFeeEnfantJourComplet() {
        Visitor enfantTestJourComplet = new Visitor(7);
        double expected = 50;
        assertEquals(expected,FeeCalculator.calculateFee(enfantTestJourComplet,TicketType.FULL_DAY));
    }
}
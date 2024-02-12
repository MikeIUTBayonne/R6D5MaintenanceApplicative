package org.example;

public class FeeCalculator {

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        if (visitor.getAge() > 14){
            fee = AdultFeeStrategy.calculate(visitor, ticketType);
        }

        if (visitor.getAge() <= 14){
            fee = ChildrenFeeStrategy.calculate(visitor, ticketType);
        }
        return fee;
    }

}

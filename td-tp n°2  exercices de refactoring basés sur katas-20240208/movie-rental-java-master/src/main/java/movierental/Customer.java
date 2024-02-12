package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = addHeaderLine();

        for (Rental rental : rentals) {
            double thisAmount = determineAmountForEachLine(rental);

            int rentalFrequentRenterPoints = addFrequentRenterPoints(rental);
            frequentRenterPoints += rentalFrequentRenterPoints;
            
            result += showFiguresForThisRental(rental, thisAmount);
            totalAmount += thisAmount;
        }

        result += addFooterLines(totalAmount, frequentRenterPoints);

        return result;
    }

    private String addHeaderLine() {
        return "Rental Record for " + getName() + "\n";
    }

    private static String addFooterLines(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " + totalAmount + "\n" + "You earned " + frequentRenterPoints + " frequent renter points";
    }

    private static String showFiguresForThisRental(Rental rental, double thisAmount) {
        return "\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n";
    }

    private static int addFrequentRenterPoints(Rental rental) {
        // add frequent renter points
        int rentalFrequentRenterPoints = 1;
        // add bonus for a two-day new release rental
        rentalFrequentRenterPoints += addBonusForATwoDaysNewReleaseRental(rental);
        return rentalFrequentRenterPoints;
    }

    private static int addBonusForATwoDaysNewReleaseRental(Rental rental) {
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
            return 1;
        return 0;
    }

    private static double determineAmountForEachLine(Rental rental) {
        double thisAmount = 0;

        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (rental.getDaysRented() > 2)
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3)
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
}

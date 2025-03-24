package TCSPreviousQuestions;

public class MarkedPriceCalculator {
    public static void main(String[] args) {
        double costPrice = 100.0; // Assume CP is 100 for simplicity
        double rottenPercentage = 20.0;
        double discountPercentage = 20.0;
        double profitPercentage = 92.0;

        // Effective fraction of apples sold
        double fractionSold = (100 - rottenPercentage) / 100.0;

        // Profit formula: Total Selling Price = (1 + profit%) * Cost Price
        double totalSellingPrice = (1 + profitPercentage / 100.0) * costPrice;

        // Selling price formula with discount
        double effectiveSellingFraction = fractionSold * (1 - discountPercentage / 100.0);

        // Solve for Marked Price
        double markedPrice = totalSellingPrice / (costPrice * effectiveSellingFraction);

        // Marked up percentage
        double markedUpPercentage = (markedPrice - 1) * 100;

        System.out.println("The seller has marked up the apples by: " + markedUpPercentage + "%");
    }
}

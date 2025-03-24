package TCSPreviousQuestions;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        double markedPrice = 100.0; // Assume MP is 100 for simplicity
        double sellingFraction = 5.0 / 6.0;
        double lossPercentage = 10.0;
        double discountPercentage = 5.0;

        // Selling price without discount
        double sellingPrice = sellingFraction * markedPrice;

        // Calculate Cost Price
        double costPrice = sellingPrice / (1 - lossPercentage / 100.0);

        // New Selling Price after discount
        double newSellingPrice = (1 - discountPercentage / 100.0) * markedPrice;

        // Profit/Loss Percentage Calculation
        double profitOrLoss = ((newSellingPrice - costPrice) / costPrice) * 100;

        // Determine profit or loss
        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss + "%");
        } else {
            System.out.println("Loss: " + (-profitOrLoss) + "%");
        }
    }
}

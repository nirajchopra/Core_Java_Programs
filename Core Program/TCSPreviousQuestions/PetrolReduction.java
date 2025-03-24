package TCSPreviousQuestions;

public class PetrolReduction {
    public static void main(String[] args) {
        // Given data
        double priceIncrease = 0.35;  // Price increased by 35%
        double budgetIncrease = 0.25; // Budget increased by 25%

        // Formula: Reduction % = ((Price Increase - Budget Increase) / (1 + Price Increase)) * 100
        double reduction = ((priceIncrease - budgetIncrease) / (100 + priceIncrease)) * 100;

        // Printing the result
        System.out.printf("Petrol quantity reduction: %.2f%%\n", reduction);
    }
}


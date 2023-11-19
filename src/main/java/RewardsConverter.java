// RewardValue.java

public class RewardValue {
    private double value;
    private String currency;

    public RewardValue(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public double convertTo(String targetCurrency, double conversionRate) {
        if (currency.equals(targetCurrency)) {
            return value; // No conversion needed
        }

        if (currency.equals("USD") && targetCurrency.equals("Miles")) {
            return value * conversionRate; // Conversion from USD to Miles
        } else if (currency.equals("Miles") && targetCurrency.equals("USD")) {
            return value / conversionRate; // Conversion from Miles to USD
        } else {
            System.out.println("Unsupported currency conversion: " + currency + " to " + targetCurrency);
            return 0.0;
        }
    }
}
// RewardsConverter.java

public class RewardsConverter {
    public static void main(String[] args) {
        // Example usage
        RewardValue cashValue = new RewardValue(100.0, "USD");
        double conversionRate = 0.1; // Assume 0.1 miles for every USD

        double miles = cashValue.convertTo("Miles", conversionRate);
        System.out.println("Converted value in Miles: " + miles);

        // You can add more test cases or use this class to interact with the RewardValue class.
    }
}

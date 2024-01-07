
package RewardsConverter.java;
// Main.java package
//public class Main {
//
//    public static void main(String[] args) {
//        // You can test the RewardValue class here
//        RewardValue cashReward = new RewardValue(100.0);
//        System.out.println("Cash Value: $" + cashReward.getCashValue());
//
//        RewardValue milesReward = new RewardValue(500);
//        System.out.println("Miles Value: " + milesReward.getMilesValue() + " miles");
//    }
//}

// RewardValue.java package
public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion method from cash to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Conversion method from miles to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}

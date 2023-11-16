public class RewardValue {
    private double cash;
    private int miles;

    // Constructors
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMiles() {
        return miles;
    }

    public double getMilesValue() {
    
        double cashValue = getCashValue();
        return cashValue * .0035;
    }
    
    // two constructors
        // one that accepts cash
        // one that accepts miles
    
    // Methods
        // getCashValue(), returns cash
        // getMilesValue(), returns miles
    // Must convert miles to cash at a rate of 0.0035

}

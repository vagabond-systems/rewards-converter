public class RewardValue {
    private double cashValue;
    private double miles;

    RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }

    RewardValue(double miles, boolean isMiles)
    {
        if (isMiles) {
            this.miles = miles * 0.0035;
        } else {
            System.out.println("Invalid constructor usage. Use the constructor with miles.");
        }
    }



    public double getCashValue() {
        return this.miles * 0.0035;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return this.cashValue / 0.0035;
    }
}

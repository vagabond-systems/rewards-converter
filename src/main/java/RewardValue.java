public class RewardValue{

    private final double cash;
    private final double miles;

    // Constructor for cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }

    // Constructor for miles value
    public RewardValue(int miles){

        this.miles = miles;
        this.cash = miles * 0.0035;
    }
    // Getter for cash value
    public double getCashValue() {
        return cash;
    }

    // Getter for miles value
    public double getMilesValue() {

        return miles;
    }
}



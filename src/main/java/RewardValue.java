public class RewardValue{

    private final double cash;

    // Constructor for cash value
    public RewardValue(double cash) {
        this.cash = cash;
    }

    // Constructor for miles value
    public RewardValue(int miles){
        this.cash = convertToCash(miles);
    }

    public int convertToMiles(double cash){
        return (int) (cash/0.0035);
    }

    public double convertToCash(int miles){
        return miles * 0.0035;
    }
    // Getter for cash value
    public double getCashValue() {
        return cash;
    }

    // Getter for miles value
    public double getMilesValue() {
        return convertToMiles(cash);
    }
}



public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }

    
    private int convertToMiles(double cash) {
        return (int) (cash / 0.0035);
    }

    private double convertToCash(int miles) {
        return miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return convertToMiles(this.cash);
    }
}

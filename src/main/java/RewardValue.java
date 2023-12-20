public class RewardValue {
    private double cash;
    private int miles;
    public static double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = (int) (cash / CONVERSION_RATE);
    }

    public RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * CONVERSION_RATE;
    }

    public int getMilesValue() {
        return miles;
    }

    public double getCashValue(){
        return cash;
    }
}

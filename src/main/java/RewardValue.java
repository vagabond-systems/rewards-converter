public class RewardValue {
    private double cash;
    private int miles;

    public static final double miles_to_cash_rate = 0.0035;

    RewardValue(double cash){
        this.cash = cash;
    }

    RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return this.miles*miles_to_cash_rate;
    }
    public double getMilesValue() {
        return this.cash/miles_to_cash_rate;
    }
}

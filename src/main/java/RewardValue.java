public class RewardValue {

    private double cash;
    private int miles;

    public static final double MILESTOCASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = (int) (cashValue/MILESTOCASH_CONVERSION_RATE);
    }
    public RewardValue(int milesValue){
        this.miles = milesValue;
        this.cash = miles * MILESTOCASH_CONVERSION_RATE;
    }

    public double getMilesValue() {
        return miles;
    }

    public double getCashValue(){
        return cash;
    }

    @Override
    public String toString() {
        return "RewardValue{" +
                "cash=" + cash +
                ", miles=" + miles +
                '}';
    }
}

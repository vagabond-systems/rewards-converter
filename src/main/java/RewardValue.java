public class RewardValue {
    public static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;


    RewardValue(double cash){
        this.cashValue = cash;
    }

    RewardValue(int miles){
        this.cashValue = MILES_TO_CASH_RATE * miles;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return (int)(cashValue / MILES_TO_CASH_RATE);
    }
}

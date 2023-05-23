public class RewardValue {
    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertFromMilesToCash(milesValue);
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue() {
        return convertFromCashToMiles(this.cashValue);
    }

    public int convertFromCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

   public double convertFromMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
   }
}

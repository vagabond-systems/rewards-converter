
public class RewardValue {
    private final double cashValue;
        public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
        }
    
        public double getCashValue() {
            return cashValue;
        }
    
        public int getMilesValue() {
            return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
        }
}

public class RewardValue {
      final   private double cashValue;
       final   private int milesValue;

        // Constructor that accepts cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = (int) (cashValue / 0.0035);
        }

        // Constructor that accepts miles value
        public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        }
    public double convertCashToMiles(double cashAmount, double conversionRate) {
        return cashAmount / conversionRate;
    }
    public double convertMilesToCash(double milesAmount, double conversionRate) {
        return milesAmount * conversionRate;
    }
        // Method to get the cash value of the RewardValue
        public double getCashValue() {
            return cashValue;
        }

        // Method to get the miles value of the RewardValue
        public int getMilesValue() {
            return milesValue;
        }
    }


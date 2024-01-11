
    public class RewardValue {
        private double cashValue;
        private double milesValue;
        private static final double MILES_TO_CASH_RATE = 0.0035;

        // Constructor for cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashValue * MILES_TO_CASH_RATE;
        }

        // Constructor for miles value
        public RewardValue(double milesValue,Boolean isMile) {
            if(isMile){
                this.milesValue = milesValue;
                this.cashValue = milesValue / MILES_TO_CASH_RATE;
            }
        }

        // Getter for cash value
        public double getCashValue() {
            return cashValue;
        }

        // Getter for miles value
        public double getMilesValue() {
            return milesValue;
        }
    }


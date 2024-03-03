


    public class RewardValue {
        private final double cashValue;
        private final double milesValue;

        // Constructor accepting cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashValue / 0.0035;
        }

        // Constructor accepting miles value
        public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        }

        // Method to get cash value
        public double getCashValue() {
            return cashValue;
        }

        // Method to get miles value
        public double getMilesValue() {
            return milesValue;
        }
    }



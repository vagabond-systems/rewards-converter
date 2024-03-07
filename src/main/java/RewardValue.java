public class RewardValue {
        private double cashValue;
        private double milesValue;

        // Constructor accepting cash value
        public RewardValue(double cashValue){
            this.cashValue=cashValue;
            this.milesValue=cashValue/0.0035; // Conversion rate: 0.0035 miles per dollar
        }

        // Constructor accepting miles value
        public RewardValue(double milesValue, boolean isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035; // Conversion rate: 0.0035 dollars per mile
        }

        // Getter method for cash value
        public double getCashValue() {
            return cashValue;
        }

        // Getter method for miles value
        public double getMilesValue() {
            return milesValue;
        }
    }


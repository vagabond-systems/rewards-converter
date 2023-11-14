    public class RewardValue {
        private double cashValue;
        private double milesValue;

        // Constructor that accepts a cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = convertToMiles(cashValue);
        }

        // Constructor that accepts a value in miles
        public RewardValue(double milesValue, boolean isMiles) {
            if (isMiles) {
                this.milesValue = milesValue;
                this.cashValue = convertToCash(milesValue);
            } else {
                throw new IllegalArgumentException("Invalid constructor call. Use the constructor with cash value.");
            }
        }

        // Getter method for cash value
        public double getCashValue() {
            return cashValue;
        }

        // Getter method for miles value
        public double getMilesValue() {
            return milesValue;
        }

        // Helper method to convert cash to miles
        private double convertToMiles(double cashValue) {
            return cashValue / 0.0035;
        }

        // Helper method to convert miles to cash
        private double convertToCash(double milesValue) {
            return milesValue * 0.0035;
        }
    }


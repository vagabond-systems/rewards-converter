public class RewardValue {
        private double cashValue;
        private double milesValue;

        // Constructor accepting cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashToMiles(cashValue);
        }

        // Constructor accepting miles value
       public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        }

        // Method to get cash value
        public double getCashValue() {
            return cashValue;
        }

        // Method to get miles value
        public double getMilesValue() {
            return milesValue;
        }

        // Convert miles to cash at a rate of 0.0035
        private double milesToCash(double miles) {
            return miles * 0.0035;
        }

        // Convert cash to miles at a rate of 1/0.0035
       private double cashToMiles(double cash) {
            return cash / 0.0035;
        }
    }
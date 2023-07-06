public class RewardValue {


        private double cashValue;
        private int milesValue;

        // Constructor accepting a cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = (int) (cashValue / 0.0035);
        }

        // Constructor accepting a value in miles
        public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        }

        // Getter for cashValue
        public double getCashValue() {
            return cashValue;
        }

        // Getter for milesValue
        public int getMilesValue() {
            return milesValue;
        }
    }




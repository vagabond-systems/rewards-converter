import java.util.Scanner;
public class RewardValue {
        private double cashValue;
        private double milesValue;

        // Constructor that accepts cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashValue / 0.0035;
        }

        // Constructor that accepts miles value
        public RewardValue(double milesValue, boolean isMiles) {
            if (isMiles) {
                this.milesValue = milesValue;
                this.cashValue = milesValue * 0.0035;
            } else {
                // Handle the case where the constructor is called with miles but isMiles is false
                this.milesValue = 0;
                this.cashValue = 0;
            }
        }

        // Method to get the cash value
        public double getCashValue() {
            return cashValue;
        }

        // Method to get the miles value
        public double getMilesValue() {
            return milesValue;
        }



}

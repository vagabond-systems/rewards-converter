    public class RewardValue 
    {
        private double cashValue;
        private double milesValue;
    
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
    
        public static void main(String[] args) {
            // Example usage:
            // Creating RewardValue object using cash value
            RewardValue rewardCash = new RewardValue(100);
            System.out.println("Cash Value: " + rewardCash.getCashValue());
            System.out.println("Miles Value: " + rewardCash.getMilesValue());
    
            // Creating RewardValue object using miles value
            RewardValue rewardMiles = new RewardValue(35000);
            System.out.println("Cash Value: " + rewardMiles.getCashValue());
            System.out.println("Miles Value: " + rewardMiles.getMilesValue());
        }
 }


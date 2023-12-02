public class RewardValue {
    double cashValue;

    int milesValue;

    public static final double MilesToCash_ConvRate = 0.0035;

    // Constructor to create the RewardValue with Cash Value
    public RewardValue(double cash){
        this.cashValue = cash;
        this.milesValue = (int)(this.cashValue/MilesToCash_ConvRate);
    }

    // Constructor to create the RewardValue with Mile Value
    public RewardValue(int mile){
        this.milesValue = mile;
        this.cashValue = this.milesValue * MilesToCash_ConvRate;
    }

    // Getter method for cashValue
    public double getCashValue(){
        return cashValue;
    }

    // Getter method for milesValue
    public int getMilesValue(){
        return milesValue;
    }

}

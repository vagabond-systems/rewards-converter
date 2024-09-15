public class RewardValue {
    private
    double cashValue;
    int milesValue;
    static double milesTocash = 0.0035;


    public RewardValue (double cashValue) {
         this.cashValue= cashValue;
         this.milesValue = (int) (cashValue / milesTocash);
    }
    public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesTocash * milesValue;

    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }



}

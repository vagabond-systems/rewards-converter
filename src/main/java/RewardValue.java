public class RewardValue {
    private double cashValue;
     private double miles;

    public RewardValue(double cashValue) {
         this.cashValue = cashValue;
    }


    public double getCashValue(double cashValue) {
        return cashValue;
    }

    public double getMilesValue() {
        miles= cashValue* 0.0035;
        return miles;
    }
    
}

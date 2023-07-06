public class RewardValue {

    private final double CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int milesValue;

    RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = miles * CONVERSION_RATE;
    }

     RewardValue(double cash) {
        this.milesValue = (int)(cash / CONVERSION_RATE);
        this.cashValue = cash;
     }
        public int getMilesValue(){
            return(milesValue);
    }

        public double getCashValue(){
        return(cashValue);
    }
}

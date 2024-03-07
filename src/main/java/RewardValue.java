public class RewardValue {

    private double cashValue;
    private int miles;
    private static final double RATE=0.0035;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    public RewardValue(int miles){
        this.miles=miles;
    }

    public double getCashValue(){
        cashValue=miles*RATE;
        return cashValue;
    }

    public int getMilesValue(){
        miles=(int)Math.round(cashValue/RATE);
        return miles;
    }
}

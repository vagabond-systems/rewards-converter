public class RewardValue {
    private double cashValues ;
    private int milesValues ;
    private static final double mileToCashRate = 0.0035;
    public RewardValue (double cashValues){ 
        this.cashValues =cashValues ;
        this.milesValues=(int) (cashValues/mileToCashRate);

    }
    public RewardValue(int milesValues ){
        this.milesValues=milesValues ;
        this.cashValues=milesValues*mileToCashRate;

    }
    public double getCashValue(){
     return cashValues;
    }
    public int getMilesValue(){
     return milesValues;
    }

}
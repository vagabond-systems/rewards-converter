public class RewardValue {
    //Instance variables
     private final double cashValue;
     private final int milesValue;

    public  RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=(int)(cashValue/0.0035);
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=milesValue*0.0035;
    }

    // getters
     public double getCashValue(){
        return cashValue;
     }
    public int getMilesValue(){
        return milesValue;
    }


}

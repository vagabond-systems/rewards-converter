public class RewardValue {

    double CV;
    int MV;
    public RewardValue(double cashValue){
        CV=cashValue;
        MV=(int)Math.round(cashValue/0.0035);
    }
    public RewardValue(int milesValue){
        MV=milesValue;
        CV=milesValue*0.0035;
    }
    public double getCashValue(){
        return CV;
    }
    public int getMilesValue(){
        return MV;
    
    }
        
    
}

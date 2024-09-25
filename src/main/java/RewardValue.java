
public class RewardValue {
    double cash;
    int miles;
    public RewardValue(double cashValue){
        cash = cashValue;
    }
    public RewardValue(int mileValue){
        miles = mileValue;
    }
    public double getCashValue(){
        if(cash != 0){return cash;}
        else{cash = (double) ( miles * 0.0035);
        return cash;}
    }
    public int getMilesValue(){
        if(miles != 0){return miles;}
        else{miles = (int) (cash/0.0035);
        return miles;}
    }

}

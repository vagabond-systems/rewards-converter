
public class RewardValue {
    double cashvalue;
    double milesvalue;
    RewardValue(double cashvalue){
        this.cashvalue=cashvalue;
        milesvalue = 0.0035*cashvalue;
    }
    double getMilesValue(){
        return milesvalue;
    }
    double getCashValue(){
        return cashvalue;
    }
}

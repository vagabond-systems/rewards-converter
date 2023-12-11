
public class RewardValue {
    double cashvalue;
    int milesvalue;
    RewardValue(double cashvalue){
        this.cashvalue=cashvalue;
        milesvalue = (int)(cashvalue/0.0035);
    }
    RewardValue(int milesvalue){
        this.milesvalue=milesvalue;
        cashvalue = milesvalue*0.0035;
    }
    double getMilesValue(){
        return milesvalue;
    }
    double getCashValue(){
        return cashvalue;
    }
}

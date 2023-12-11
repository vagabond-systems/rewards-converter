
public class RewardValue {
    double cashvalue;
    int milesvalue;
    RewardValue(double cashvalue){
        this.cashvalue=cashvalue;
    }
    RewardValue(int milesvalue){
        cashvalue=convertMilesValue(milesvalue);
    }
    double convertMilesValue(int milesvalue){
        return milesvalue*0.0035;
    }
    int convertCashValue(double cashValue){
        return (int)(cashValue/0.0035);
    }
    int getMilesValue(){
        return convertCashValue(cashvalue);
    }
    double getCashValue(){
        return cashvalue;
    }
}

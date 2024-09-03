public class RewardValue {
    double cashValue;
    int milesValue;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    int getMilesValue(){
        return (int)(cashValue/0.0035);
    }
    double getCashValue(){
        return milesValue*0.0035;
    }
}

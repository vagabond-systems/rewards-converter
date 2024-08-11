public class RewardValue {
    double cashValue;
    float milesValue;
    RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    RewardValue(float milesValue){
        this.milesValue=milesValue;
    }
    double getCashValue(){
        return this.cashValue;
    }
    double getMilesValue(){
        return cashValue*0.0035;
    }

}
public class RewardValue {
    double cashValue;
    float miles;
    RewardValue(double cashValue){
    this.cashValue=cashValue;
    }
    RewardValue(float miles){
    this.miles=miles;
    }
    double getCashValue(){
        //this function returns the cash value of the RewardValue
        return cashValue;
    }
    float getMilesValue(){
        //returns how many miles the RewardValue is worth
        return (float) (cashValue/0.0035);
    }

}

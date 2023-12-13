public class RewardValue {

    double cash;

    double getCashValue(){
        return cash;
    }

    double getMilesValue(){
        return this.cash * 0.0035;
    }


    RewardValue(double cashValue){
        this.cash = cashValue;
    }
    RewardValue(int milesValue ){
        this.cash = milesValue / 0.0035;
    }

}

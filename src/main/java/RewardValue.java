public class RewardValue{

    double cashValue;
    double conversionRate = 0.0035;

    RewardValue(double cashValue){

        this.cashValue = cashValue;
    }

    RewardValue(int milesValue){

        this.cashValue = getMilesValue();
    }

    double getCashValue(){
        return cashValue;
    }

    double getMilesValue() {

        return cashValue * conversionRate;

    }


}

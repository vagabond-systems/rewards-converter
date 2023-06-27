public class RewardValue{

    double cashValue;

    RewardValue(double cashValue){

        this.cashValue = cashValue;
    }

    double getCashValue(){
        return cashValue;
    }

    double getMilesValue() {

        double conversionRate = 0.0035;
        return cashValue * conversionRate;

    }
}

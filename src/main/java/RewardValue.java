public class RewardValue {

    double cashValue;
    double conversionRate = 0.0035;

    RewardValue(double cashValue) {

        this.cashValue = cashValue;
    }

    RewardValue(int milesValue) {

        this.cashValue = convertToCash(milesValue);
    }

    double getCashValue() {
        return cashValue;
    }

    int getMilesValue() {

        return convertToMiles(this.cashValue);

    }

    int convertToMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }

    double convertToCash(int milesValue){
        return milesValue * conversionRate;
    }
}
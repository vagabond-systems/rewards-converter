public class RewardValue {
    private double cashValue;
    private final double MILES_TO_CASH_RATE = 0.0035;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int miles) {
        this.cashValue = convertMilestoCash(miles);
    }

    private double convertMilestoCash(int miles){
        return miles*this.MILES_TO_CASH_RATE;
    }
    private int convertCashtoMiles(double cash){
        return (int) (cash / this.MILES_TO_CASH_RATE);
    }

    int getMilesValue() {
        return convertCashtoMiles(this.cashValue);        
    }

    double getCashValue() {
        return this.cashValue;
    }

}

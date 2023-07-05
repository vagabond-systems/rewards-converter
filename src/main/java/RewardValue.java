//public class RewardValue{
//    private double number;
//
//    public RewardValue(double number) {
//        this.number = number;
//    }
//    public double getCashValue () {
//        return number * 0.0035;
//    }
//    public double getMilesValue () {
//        return number / 0.0035;
//    }
//};

//^^^ this is my code and thought process before seeing the correct approach
public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
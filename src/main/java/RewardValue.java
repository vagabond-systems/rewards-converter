public class RewardValue {
    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue = 0.0;
    private int milesValue = 0;

    //The project specification says that you must convert from miles to cash. My reading of the problem is that this is a one-way conversion.
    //Therefore, I do not convert cash back into miles when using the cash constructor

    public RewardValue(double cash) {
        cashValue = cash;
    }

    public RewardValue(int miles) {
        milesValue = miles;
        cashValue = miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}

public class RewardValue {
    private final double cashValue;
//    private int milesValue;
    public static final double miles_to_cash_rate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public int convertToMiles(double cashValue)
    {
//        milesValue = (int) (cashValue / miles_to_cash_rate);
        return (int) (cashValue / miles_to_cash_rate);
    }

    public double convertToCash(int milesValue)
    {
        return milesValue * miles_to_cash_rate;
    }
    public double getCashValue()
    {
        return cashValue;
    }

    public double getMilesValue(){
//        milesValue = convertToMiles(this.cashValue);
        return convertToMiles(cashValue);
//        return milesValue;
    }
}

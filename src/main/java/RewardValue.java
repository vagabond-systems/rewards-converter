public class RewardValue {

    double cashValue;
    static final double conversionRate = 0.0035;

    RewardValue(double Cash)
    {
        cashValue = Cash;
    }

    RewardValue(int miles)
    {
        cashValue = convertToCash(miles);
    }

    public double convertToCash(int Miles){
        return Miles*conversionRate;
    }

    public int convertToMiles(double cashValue)
    {
        return (int)(cashValue/conversionRate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

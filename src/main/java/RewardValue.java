public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double exchangeRate = .0035;

    //constructors
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int cashToMilesConverter(double cashValue){
        int milesConverted;
        milesConverted = (int)(cashValue / exchangeRate);
        return milesConverted;
    }

    public double milesToCashConverter(int miles){
        double cashConverted;
        cashConverted = miles * exchangeRate;
        return cashConverted;
    }





}

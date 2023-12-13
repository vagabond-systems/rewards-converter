public class RewardValue {
    private final double cashValue;
    private double milesToCashConVersionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    private double convertToCash(int milesValue) {
        return milesValue * milesToCashConVersionRate;
    }

    private double convertToMiles(double cashValue){
        return (cashValue / milesToCashConVersionRate);
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

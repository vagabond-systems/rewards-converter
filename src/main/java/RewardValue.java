public class RewardValue {

    double cashValue;
    int milesValue;
    double conversionRate = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue = milesToCash(milesValue);
    }

    public double milesToCash(int milesValue) {
        return milesValue*conversionRate;
    }

    public int getMilesValue(){
        milesValue = (int) (cashValue/conversionRate);
        return cashToMiles(cashValue);
    }

    public int cashToMiles(double cashValue) {
        return (int) (cashValue/conversionRate);
    }

    public double getCashValue(){
        return cashValue;
    }
}

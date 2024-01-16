public class RewardValue {
    double cashValue;
    double milesValue;

    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }

    private double cashValueToMiles(double cashValue){
        return cashValue / 0.0035;
    }

    private double milesToCashValue(double milesValue){
        return milesValue * 0.0035;
    }

    public RewardValue(double cashValue){
        this.cashValue= cashValue;
        this.milesValue = cashValueToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles){
        if (isMiles){
        this.milesValue = milesValue;
        this.cashValue = milesToCashValue(milesValue);}
    }
}

//
package RewardValue;

public class RewardValue{

    double cashValue=0;
    int milesValue;
    final static double conversion_rate=0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = cash_value(milesValue);
    }

    public double cash_value(int milesValue){
        return milesValue*conversion_rate;
    }



    public double getCashValue() {
        return cashValue;
    }

    public Integer getMilesValue() {
            return (int) (cashValue/conversion_rate);


    }
}

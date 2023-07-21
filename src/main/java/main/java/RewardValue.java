package main.java;

public class RewardValue {
    double cashValue;
    String milesValues;
    public RewardValue(double cashValue) {
        this.cashValue=cashValue;
    }
    public RewardValue(String milesValue){
        this.milesValues=milesValue;
    }
    public String getMilesValue() {
        return conversionToMiles(this.cashValue);
    }

    public double getCashValue() {
      return cashValue;
    }

    //for conversion
    public String conversionToMiles(double cashValue){
        return String.valueOf(cashValue/0.0035);
    }
}

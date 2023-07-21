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
        double result = cashValue*0.0035;
        return String.valueOf(result);

    }

    public void getCashValue() {

    }

}

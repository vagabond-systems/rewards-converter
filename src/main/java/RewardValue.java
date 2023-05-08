package main.java;

public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static double convRate = 0.0035;
    public RewardValue(double cashV){
        cashValue = cashV;
        milesValue = (int) (cashValue / convRate);
    }

    public RewardValue(int milesV){
        milesValue = milesV;
        cashValue = milesValue * convRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}

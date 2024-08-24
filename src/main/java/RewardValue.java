import java.util.Scanner;

public class RewardValue {
    private double flightCash;
    private double miles;

    public RewardValue(double cashVal) {
        this.flightCash = cashVal;
    }

    public RewardValue(int mileVal) {
        this.miles = mileVal;
    }

    public double convertFromCashToMiles(double flightCash) {
        return flightCash / 0.0035;
    }

    public double convertFromMilesToCash(int miles) {
        return miles * 0.0035;
    }

    public double getCashValue() {
        return flightCash;
    }

    public double getMilesValue() {
        return miles;
    }

}
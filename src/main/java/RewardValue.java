import java.math.BigDecimal;

public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        double cashValue;
        cashValue = this.miles / 0.0035;
        return cashValue;
    }

    public double getMilesValue() {
        int milesValue;
        milesValue = (int)(this.cash * 0.0035);
        return milesValue;
    }


    //GETTERS & SETTERS
    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getMiles() {
        return this.miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}

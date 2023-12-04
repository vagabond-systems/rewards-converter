public class RewardValue {

    private double cash;

    private double miles;

//    public RewardValue() {
//    }


    public RewardValue(double cash) {
        mileageMath(cash);
        this.cash = cash;
    }

    public RewardValue(double cash, double miles) {
        this.cash = cash;
        this.miles = miles;
    }

    public double getCashValue() {
        return cash;
    }

    public void setCashValue(double cash) {
        this.cash = cash;
    }

    public double getMilesValue() {
        return miles;
    }

    public void setMilesValue(double miles) {
        this.miles = miles;
    }

    public double mileageMath(double cash){
        miles = cash * .0035;
        return miles;
    }
}

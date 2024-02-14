public class RewardValue {
    private double cash;
    private double miles;

    // Constructor accepting cash
    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = cash * 0.0035;
    }

    // Constructor accepting miles
    public RewardValue(int miles){
        this.miles = miles;
        this.cash = miles / 0.0035;
    }



    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return miles;
    }
}

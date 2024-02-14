public class RewardValue {
    private double cash;
    private int miles;

    // Constructor accepting cash
    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = (int) (cash / 0.0035);
    }

    // Constructor accepting miles
    public RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * 0.0035;
    }



    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }
}

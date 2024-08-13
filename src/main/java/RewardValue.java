public class RewardValue {
    private double cash = 0;
    private int miles = 0;
    private final double RATE = 0.0035;
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return cash == 0 ? miles * RATE : cash;
    }

    public int getMilesValue(){
        return miles == 0 ? (int) (cash / RATE) : miles;
    }
}

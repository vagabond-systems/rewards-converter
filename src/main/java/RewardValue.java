public class RewardValue {

    public RewardValue(double cash, int miles) {
        this.cash = cash;
        this.miles = miles;
    }

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / 0.0035);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = 0.0035*miles;
    }
    private double cash;
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    private int miles;

    public int getMiles() {
        return miles;
    }
    public void setMiles(int miles) {
        this.miles = miles;
    }
    @Override
    public String toString() {
        return "RewardValue []";
    }
    public static void main(String[] args) {
        
    }
    public double getCashValue() {
        return cash;
    }
    public int getMilesValue() {
        return miles;
    }

}
 

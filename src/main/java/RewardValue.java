public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double cash){
        setCash(cash);
    }
    public RewardValue(int miles){
        setMiles(miles);
    }
    
    public void setCash(double c){
        this.cash=c;
    }
    public void setMiles(int m){
        this.miles=m;
    }

    public double getCashValue() {
        return miles*0.0035;
    }

    public int getMilesValue() {
        return (int)cash/0.0035;
    }
}

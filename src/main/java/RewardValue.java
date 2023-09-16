public class RewardValue {
    double cash;
    static final double M_TO_CASH_RATE = 0.0035;
    double MilesToCash(int miles){
        return miles * M_TO_CASH_RATE;
    }
    int CashToMiles(double cash){
        return (int)(cash / M_TO_CASH_RATE);
    }
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.cash = this.MilesToCash(miles);
    }
    public double getCashValue(){
        return this.cash;
    }
    public int getMilesValue(){
        return CashToMiles(this.cash);
    }
}

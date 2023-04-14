public class RewardValue {
    private double cash;
    private int mile;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int mile){
        this.mile = mile;
    }

    public double getCashValue(){
        return mile == 0 ? cash : (double) Math.round(mile * 0.0035 * 100) / 100;
    }

    public int getMilesValue(){
        return cash == 0 ? mile : (int) Math.ceil((int) Math.round(cash / 0.0035));
    }


}

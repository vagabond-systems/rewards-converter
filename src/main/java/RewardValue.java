public class RewardValue {
    private double cash;
    private double miles;

    RewardValue(double cash)
    {
        this.cash=cash;
    }

    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        miles = 0.0035 * cash;
        String s = String.format("%.4f", miles);
        double d = Double.parseDouble(s);
        return d;
    }
}

public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double x) {
        milesValue = convctom(x);
        cashValue = x;
    }

    public RewardValue(int x) {
        cashValue=convmtoc(x);
        milesValue = x;
    }

    public double convmtoc(int x) {
        double u = 0.0035;
        double z = x;
        double ans = u * z;
        return ans;
    }

    public int convctom(double x) {
        double u = 35;
        double v = x;
        v = v * 10000;
        v = v / u;
        int ans = (int) v;
        return ans;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

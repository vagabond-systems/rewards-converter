public class RewardValue{
    private double number;

    public RewardValue(double number) {
        this.number = number;
    }
    public double getCashValue () {
        return number * 0.0035;
    }
    public double getMilesValue () {
        return number / 0.0035;
    }
};
public class RewardValue {

    private double cash;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = convertToCash(miles);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return (int) (cash / 0.0035);
    }
}

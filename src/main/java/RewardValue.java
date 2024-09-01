public class RewardValue {

    private double cashValue;
    private static double constant=0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int miles){
    this.cashValue=convertMilestoCash(miles);
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
     int result=(int)(cashValue*constant);
     return result;
    }
    public static double convertMilestoCash(int miles){
        double res=(miles/constant);
        return res;
    }


}

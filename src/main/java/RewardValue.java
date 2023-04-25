public class RewardValue {
    public milesToCashConversionRate = 0.0035;
    int cashValue = 0;
    float miles = 0.00F;

    public RewardValue(int cashValue, float miles) {
        this.cashValue = cashValue;
        this.miles = miles;
    }
    public static void main(String[] args) {
        RewardValue myCashValue = new getCashValue("$5");
        RewardValue myMilesValue = new getMilesValue(100);
        System.out.println(myCashValue.cashValue + " " + myMilesValue.miles);
    }

}

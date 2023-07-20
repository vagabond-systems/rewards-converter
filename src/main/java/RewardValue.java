public class RewardValue {
    public static final double milestocashrate = 0.0035;
    private final double cashValue;
    public RewardValue(double cashValue){this.cashValue=cashValue;}
    public RewardValue(int milesValue){this.cashValue=milestocashrate*milesValue;}
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return (int) ((int)cashValue/milestocashrate);
    }
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / milestocashrate);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * milestocashrate;
    }
}

public class RewardValue {

    private final double cashValue;
    private static final double RATE=0.0035;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }

    public RewardValue(int miles){
        this.cashValue=milestoCash(miles);
    }

    private static double milestoCash(int miles)
    {
        return miles*RATE;
    }

    private static int cashToMiles(double cashValue)
    {
        return (int) (cashValue/RATE);
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return cashToMiles(this.cashValue);
    }


}

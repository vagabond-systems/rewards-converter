public class RewardValue {

    private double cashval;
    private int milesval;

    public RewardValue( double cash){

        cashval = cash;
        milesval = (int) (cashval/0.0035);
    }
    public RewardValue(int miles){
        milesval = miles;
        cashval = milesval * 0.0035;
    }

    public double getCashValue(){

        return cashval;
    }

    public double getMilesValue(){
        return milesval;
    }
}

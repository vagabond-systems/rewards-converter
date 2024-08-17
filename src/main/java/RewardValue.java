public class RewardValue {

    public static final double milesToCashRate = 0.0035;
    private double cashBalance;




    public RewardValue(double cash){
        cashBalance = cash;
    }

    public RewardValue(int miles){
        cashBalance = miles * milesToCashRate;//miles to cash
    }



    //Methods
    public double getCashValue(){
        return cashBalance;
    }


    public double getMilesValue(){
        return (int)(cashBalance / milesToCashRate); //converting cash to miles
    }


}

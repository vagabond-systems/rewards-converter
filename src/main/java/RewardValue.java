public class RewardValue {

    //Instance Variables
    private double cash;
    private int miles;
    final private double CONVERT_RATE = 0.0035;

    //Constructors
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }
    //Getters

    public double getCash() {
        return cash;
    }

    public int getMiles() {
        return miles;
    }


    //Methods
    public int getMilesValue (double cash){
        double milesNumber = (cash / CONVERT_RATE);
        return (int) milesNumber;
    }

    public double getCashValue(){
        double cashNumber = miles * CONVERT_RATE;
        return cashNumber;
    }

}
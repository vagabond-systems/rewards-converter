public class RewardValue {

    //Instance Variables
    private double cashValue;
    private int milesValue;
    final private double CONVERT_RATE = 0.0035;

    //Constructors
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }


    //Getters

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double getCONVERT_RATE() {
        return CONVERT_RATE;
    }

    //Methods
    public int convertCashToMiles(double cashValue){
        double milesNumber = (cashValue / CONVERT_RATE);

        return (int) milesNumber;
    }

    public double convertMilesToCash(){

        double cashNumber = milesValue * CONVERT_RATE;

        return cashNumber;
    }

}

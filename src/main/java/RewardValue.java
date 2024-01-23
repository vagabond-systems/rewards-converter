public class RewardValue {
    private double cashValue;
    private double milesValue;

    // constructor accepting cash value
    public  RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // constructor  accepting miles value
    public RewardValue(Double milesValue,boolean isMiles){
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // method to convert cash to miles at rate of 0.0035
    private double cashToMiles(double cashValue){
        return  cashValue/0.0035;
    }

    //method to convert miles to cash at rate of 0.0035
    private double milesToCash(double milesValue){
        return milesValue*0.0035;
    }

    // getter method for cash value

    public double getCashValue() {
        return cashValue;
    }

    // getter method for miles value

    public double getMilesValue() {
        return milesValue;
    }
}

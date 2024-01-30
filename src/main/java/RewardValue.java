public class RewardValue {

    //miles to cash conversion rate
    private final double MILES_TO_CASH = 0.0035;

    private final double cashValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
       this.cashValue = convertToCash(milesValue);
    }

    //methods
    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }

    public int convertToMiles(double cashValue){
        return (int)(cashValue  / MILES_TO_CASH);
    }

    public double convertToCash(int miles){
        return miles * MILES_TO_CASH;
    }

}

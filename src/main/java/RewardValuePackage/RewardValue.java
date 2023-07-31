package RewardValuePackage;

// define class name
public class RewardValue {

    private double cash;
    private double miles;

    public static final double conversionRate = 0.0035 ;



    // Define constructor to initalize reward with given value

    public RewardValue(double cash) {
        this.cash = cash; // assigns values from construcrs paramaeter
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;

    }

    public int convertToMiles(double cash){
        return (int) (cash /conversionRate) ;

    }

    public double convertToCash(int miles){
        return miles * conversionRate ;
    }



}

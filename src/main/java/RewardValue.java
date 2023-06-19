public class RewardValue {

    //Creating private instance variables
    private double cash;

    private double miles;

    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;


    //Constructor 1 - converts cash given to equivalent miles
    // Also instantiates local instance variables
    public RewardValue(double cash){
        this.cash = cash;
        miles = cash/(MILES_TO_CASH_CONVERSION_RATE);
    }

    //Constructor 2 - converts miles given to equivalent cash
    // Also instantiates local instance variables
    public RewardValue(int miles){
        this.miles = miles;
        cash = miles*MILES_TO_CASH_CONVERSION_RATE;
    }

  //returns cash value
  public double getCashValue(){
        return cash;
  }

  //returns miles value
  public double getMilesValue(){
        return miles;
  }


}

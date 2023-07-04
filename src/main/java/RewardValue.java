public class RewardValue {

    // attributes
    double cash;
    int miles;
    // constructors
    public RewardValue(double inputCash){
         cash = inputCash;
    }

    public RewardValue(int inputMiles){
         miles = inputMiles;
    }

    // methods

    public double getCashValue(){
     return cash;
    };

    public int getMilesValue(){
        return miles;
    };

    public double convertMilesToCash(){
        final double conversion_rate = .0035;

        return (double)miles * conversion_rate;
    };

    public int convertCashToMiles(){
        final double conversation_rate = .0035;

        return (int) (cash / conversation_rate);
    };

}

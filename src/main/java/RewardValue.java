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
       final double conversion_rate = .0035;

       return (double)miles * conversion_rate;
    };

    public int getMileValue(){
        final double conversation_rate = .0035;

        return (int) (cash / conversation_rate);
    };

}

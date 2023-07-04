public class RewardValue {

    // constructors
    public RewardValue(decimal inputCash){
        decimal cash = inputCash;
    }

    public RewardValue(int inputMiles){
        int miles = inputMiles;
    }

    // methods

    public decimal getCashValue( int miles){
       final decimal conversion_rate = .0035;

       return (decimal)miles * conversion_rate;
    };

    public int getMileValue(){
        return mileValue * miles;
    }

}

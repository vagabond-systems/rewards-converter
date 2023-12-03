public class RewardValue {

    // CLASS VARIABLES
    double cashValue;
    int milesValue;
    double ratio = 0.0035;

    // CONSTRUCTORS
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    };
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
    };


    // METHODS
    public double getCashValue(){
        return ((double)milesValue / ratio);
    };


    public double getMilesValue(){
        return ((cashValue * ratio));
    };

}

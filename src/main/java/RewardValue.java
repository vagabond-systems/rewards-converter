public class RewardValue {

    // CLASS VARIABLES
    private final double cashValue;
    public static final double ratio = 0.0035;

    // CONSTRUCTORS
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    };
    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    };


    // METHODS
    private static int convertToMiles(double cashValue){
        return (int)(cashValue / ratio);
    }

    private static double convertToCash(int milesValue){
        return milesValue * ratio;
    }


    public double getCashValue(){
        return cashValue;
    };


    public double getMilesValue(){
        return convertToMiles(this.cashValue);
    };

    // GETTERS AND SETTERS

    public double getRatio() {
        return this.ratio;
    }

}

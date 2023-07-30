import java.util.MissingFormatArgumentException;

public class RewardValue{
    private double cashValue;
    private double milesValue;
    private final double CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue) throws IllegalArgumentException{
        if(cashValue < 0){
            throw new IllegalArgumentException("Value inserted cannot be negative");
        }
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }
    public RewardValue(int numberOfMiles) throws IllegalArgumentException{
        if(numberOfMiles < 0){
            throw new IllegalArgumentException("Value inserted cannot be negative");
        }
        this.milesValue = (double)numberOfMiles;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }
}

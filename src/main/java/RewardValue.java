import java.math.BigDecimal;

public class RewardValue {

    //Instance Variables
    private double cash;

    private int miles;

    private final double RATE = 0.0035;


    //Constructors
    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }


    //Getters
    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }


    //Methods
    public double cashToMiles(){
        return getCashValue() / RATE;
    }


}

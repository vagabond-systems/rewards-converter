import java.util.Objects;

public class RewardValue {
    /**
     * variables cashValue and milesValue
     */
    private double cashValue;
    private int milesValue;

    /**
     * Constructor which takes cashValue as input
     * @param cashValue: cash value of the RewardValue.
     */
    public RewardValue( double cashValue) {
        this.cashValue = cashValue;
    }

    /**
     * Constructor which takes milesValue as input
     * @param milesValue: miles the RewardValue is worth.
     */
    public RewardValue( int milesValue) {
        this.cashValue = convert_from_miles_to_cash(milesValue);
    }

    //RewardValue must convert from miles to cash at a rate of 0.0035


    public double getCashValue() {
        return cashValue;
    }


    public int getMilesValue() {
        return convert_from_cash_to_miles(this.cashValue);
    }

    /**
     *
     * @return returns how many miles the RewardValue is worth.
     */
    public int convert_from_cash_to_miles(double cashValue) {
        return (int) (cashValue/0.0035);
    }

    /**
     *
     * @return returns the cash value of the RewardValue.
     */
    public double convert_from_miles_to_cash(int milesValue) {
        return (Math.round((milesValue * 0.0035)*100.0)/100.0);
    }


    @Override
    public String toString() {
        return "RewardValue{" +
                "cashValue=" + cashValue +
                ", milesValue=" + milesValue +
                '}';
    }
}

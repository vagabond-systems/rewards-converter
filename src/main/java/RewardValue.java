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
        this.milesValue = milesValue;
    }

    //RewardValue must convert from miles to cash at a rate of 0.0035

    /**
     *
     * @return returns the cash value of the RewardValue.
     */
    public double getCashValue() {
        return (Math.round((milesValue * 0.0035)*100.0)/100.0);
    }

    /**
     *
     * @return returns how many miles the RewardValue is worth.
     */
    public int getMilesValue() {
        return (int) (cashValue/0.0035);
    }


 //   public int convert_from_cash_to_miles() {
 //       return (int) (cashValue/0.0035);
 //   }


 //   public double convert_from_miles_to_cash() {
 //       return (Math.round((milesValue * 0.0035)*100.0)/100.0);
 //   }


    @Override
    public String toString() {
        return "RewardValue{" +
                "cashValue=" + cashValue +
                ", milesValue=" + milesValue +
                '}';
    }
}

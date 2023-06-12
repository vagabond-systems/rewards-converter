import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    /** If miles are converted to cash at 0.0035, 1 mile = $0.0035.
     * Private setters are applied to keep data from being manipulated from the outside. **/

    private double cashValue;
    private int miles;
    private final double rate =  .0035;


    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }


    public double getCashValue(){
        if ( miles == 0){
            return cashValue;
        }

        double product = miles * rate;

        BigDecimal bd = BigDecimal.valueOf(product);
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        setCashValue(bd.doubleValue());
        return bd.doubleValue();
    }

    private void setCashValue(double cashValue){
        this.cashValue = cashValue;
    }

    public int getMilesValue(){
        if (cashValue == 0.0){
            return miles;
        }

        BigDecimal quotient = BigDecimal.valueOf(cashValue / rate);

        setMilesValue(quotient.intValue());
        return quotient.intValue();
    }

    private void setMilesValue(int miles){
        this.miles = miles;
    }
}

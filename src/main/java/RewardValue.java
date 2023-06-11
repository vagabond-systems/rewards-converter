import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    /** If miles are converted to cash at 0.0035, 1 mile = $0.0035.
     * Although class is not completely immutable,
     * private setters are applied to keep data from being manipulated **/

    private double cashValue;
    private int miles;
    private BigDecimal decimal;
    private double rate =  .0035;

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
        if (decimal == null){
            BigDecimal temp = BigDecimal.valueOf(0.0);
            setDecimal(temp);

            /** Add the remainder of the mileage **/
            double product = (miles + decimal.doubleValue()) * rate;

            BigDecimal bd = BigDecimal.valueOf(product);
            bd = bd.setScale(2, RoundingMode.HALF_UP);

            setCashValue(bd.doubleValue());
            return bd.doubleValue();
        } else {
            double product = (miles + decimal.doubleValue()) * rate;

            BigDecimal bd = BigDecimal.valueOf(product);
            bd = bd.setScale(2, RoundingMode.HALF_UP);

            setCashValue(bd.doubleValue());
            return bd.doubleValue();
        }
    }

    private void setCashValue(double cashValue){
        this.cashValue = cashValue;
    }

    public int getMilesValue(){
        if (cashValue == 0.0){
            return miles;
        }

        BigDecimal product = BigDecimal.valueOf(cashValue * 1);
        BigDecimal quotient = BigDecimal.valueOf(product.doubleValue() / rate);

        /** Save the remainder of the mileage to get accurate cash conversion **/
        BigDecimal remainder = quotient.subtract(BigDecimal.valueOf(quotient.intValue()));

        setDecimal(remainder);
        setMilesValue(quotient.intValue());
        return quotient.intValue();
    }

    private void setDecimal(BigDecimal decimal){
        this.decimal = decimal;
    }

    private void setMilesValue(int miles){
        this.miles = miles;
    }
}

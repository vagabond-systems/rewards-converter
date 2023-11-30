import java.math.BigDecimal;

public class RewardValue {
private BigDecimal cash;
private int miles;

//    CONSTRUCTORS
    public RewardValue(BigDecimal cash) {
        if (cash.compareTo(BigDecimal.ZERO) >= 0) {
            this.cash = cash.setScale(2);

                convertCashToMiles(cash);

            }
    }

    public RewardValue(int miles) {
        if (miles >= 0) {
            this.miles = miles;
            convertMilesToCash(miles);
        }
    }

//    OTHER METHODS

//    for BigDecimal conversion into (int)miles
    public void convertCashToMiles(BigDecimal cash) {
        try {
            BigDecimal ratio = BigDecimal.valueOf(0.0035);
            double milesValue = ratio.doubleValue() * cash.doubleValue();
            setMiles((int)milesValue);
        }
        catch (NullPointerException e){
            throw new NullPointerException();
        }

    }

// for int conversion into BigDecimal cash
    public void convertMilesToCash(int miles){
        double ratio = 0.0035;
         double cashValue = miles / ratio;
         setCash(BigDecimal.valueOf(cashValue));
    }

//    GETTERS


    public BigDecimal getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }

//    SETTERS

    private void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    private void setMiles(int miles) {
        this.miles = miles;
    }
}

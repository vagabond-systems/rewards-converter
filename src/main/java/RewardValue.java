import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    private double cashValue;
    private int miles;
    private BigDecimal decimal;

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

            double rate =  .35;
            double product = (miles + decimal.doubleValue()) * rate;

            BigDecimal bd = BigDecimal.valueOf(product);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            setCashValue(bd.doubleValue());
            return bd.doubleValue();
        } else {
            double rate =  .35;
            double product = (miles + decimal.doubleValue()) * rate;

            BigDecimal bd = BigDecimal.valueOf(product);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            setCashValue(bd.doubleValue());
            return bd.doubleValue();
        }
    }

//        public double convertFromMilesToCash(){
//
//        if (decimal == null){
//            BigDecimal temp = BigDecimal.valueOf(0.0);
//            setDecimal(temp);
//
//            double rate =  .35;
//            double product = (miles + decimal.doubleValue()) * rate;
//
////            System.out.println("Grab remainder: " + decimal.doubleValue());
////            System.out.println("This is rate: " + rate);
////            System.out.println("This is product: " + product);
//
//            BigDecimal bd = BigDecimal.valueOf(product);
//            bd = bd.setScale(2, RoundingMode.HALF_UP);
//            setCashValue(bd.doubleValue());
//            return bd.doubleValue();
//        } else {
//            double rate =  .35;
//            double product = (miles + decimal.doubleValue()) * rate;
//
//            BigDecimal bd = BigDecimal.valueOf(product);
//            bd = bd.setScale(2, RoundingMode.HALF_UP);
//            setCashValue(bd.doubleValue());
//            return bd.doubleValue();
//        }
//    }

    public void setCashValue(double cashValue){
        this.cashValue = cashValue;
    }

    public int getMilesValue(){
        if (cashValue == 0.0){
            return miles;
        }

        double rate = .35;
        BigDecimal product = BigDecimal.valueOf(cashValue * 1);
        BigDecimal quotient = BigDecimal.valueOf(product.doubleValue() / rate);
        BigDecimal remainder = quotient.subtract(BigDecimal.valueOf(quotient.intValue()));

        setDecimal(remainder);
        setMilesValue(quotient.intValue());
        return quotient.intValue();
    }

//    public int convertFromCashToMiles(){
//        double rate = .35;
////        double product = cashValue * 1;
////        double quotient = product / rate;
//
//        BigDecimal product = BigDecimal.valueOf(cashValue * 1);
//        BigDecimal quotient = BigDecimal.valueOf(product.doubleValue() / rate);
//        BigDecimal remainder = quotient.subtract(BigDecimal.valueOf(quotient.intValue()));
//
////        System.out.println("This is product: " + product);
////        System.out.println("This is quotient: " + quotient);
////        System.out.println("This is int quotient: " + quotient.intValue());
////        System.out.println("This is remainder: " + remainder);
//
//        setDecimal(remainder);
//        setMilesValue(quotient.intValue());
//        return quotient.intValue();
//    }

    public void setDecimal(BigDecimal decimal){
        this.decimal = decimal;
    }

    public void setMilesValue(int miles){
        this.miles = miles;
    }
}

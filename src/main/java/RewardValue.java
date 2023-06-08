import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    private double cashValue;
    //change to int
    private int miles;
    private BigDecimal decimal;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }


    public double getCashValue(){
        return cashValue;
    }

        public double convertFromMilesToCash(){

        if (decimal == null){
            BigDecimal temp = BigDecimal.valueOf(0.0);
            setDecimal(temp);

            double rate =  .35;
            double product = (miles + decimal.doubleValue()) * rate;

            System.out.println("Grab remainder: " + decimal.doubleValue());
            System.out.println("This is rate: " + rate);
            System.out.println("This is product: " + product);

            BigDecimal bd = BigDecimal.valueOf(product);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        } else {

            double rate =  .35;
            double product = (miles + decimal.doubleValue()) * rate;

            System.out.println("Grab remainder: " + decimal.doubleValue());
            System.out.println("This is rate: " + rate);
            System.out.println("This is product: " + product);

            BigDecimal bd = BigDecimal.valueOf(product);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }

    }

//    public double convertFromMilesToCash(){
//        double newRate = .35 * 100;
//        double rate =  newRate + 100;
//        double quotient = 100 / rate;
//        double product = quotient * miles;
//
////        System.out.println("This is newRate: " + newRate);
////        System.out.println("This is rate: " + rate);
////        System.out.println("This is quotient: " + quotient);
////        System.out.println("This is product: " + product);
//
//        BigDecimal bd = BigDecimal.valueOf(product * 100);
//        bd = bd.setScale(2, RoundingMode.HALF_UP);
//        return bd.doubleValue();
//    }

//    public double convertFromMilesToCash(){
//        double rate = miles * 100;
//        double product = rate * .35;
//        double difference = rate - product;
//
////        System.out.println("This is rate: " + rate);
////        System.out.println("This is product: " + product);
////        System.out.println("This is difference: " + difference);
//
//        BigDecimal bd = new BigDecimal(String.valueOf(difference));
//        bd.setScale(2, RoundingMode.HALF_UP);
//        //System.out.println("This is BD: " + bd.doubleValue());
//        return bd.doubleValue();
//    }

    public void setCashValue(double cashValue){
        this.cashValue = cashValue;
    }

    public int getMilesValue(){
        return miles;
    }

    public int convertFromCashToMiles(){
        double rate = .35;
//        double product = cashValue * 1;
        BigDecimal product = BigDecimal.valueOf(cashValue * 1);
        //int quotient = (int)(product / rate);
//        double quotient = product / rate;
        BigDecimal quotient = BigDecimal.valueOf(product.doubleValue() / rate);

        BigDecimal remainder = quotient.subtract(BigDecimal.valueOf(quotient.intValue()));
        //BigDecimal result = BigDecimal.valueOf(quotient);
        System.out.println("This is product: " + product);
        System.out.println("This is quotient: " + quotient);
        System.out.println("This is int quotient: " + quotient.intValue());
        System.out.println("This is remainder: " + remainder);

        setDecimal(remainder);


        return quotient.intValue();
    }

//    public double convertFromCashToMiles(){
//        double product = cashValue * 0.35;
//        double sum = cashValue + product;
////        int result = (int)(sum / 100);
//        double result = sum / 100;
//
//
//        System.out.println("This is product: " + product);
//        System.out.println("This is sum: " + sum);
//        System.out.println("This is result: " + result);
//
//
//        BigDecimal bd = BigDecimal.valueOf(result);
//        bd = bd.setScale(4, RoundingMode.HALF_UP);
//        return bd.doubleValue();
//    }

    public void setDecimal(BigDecimal decimal){
        this.decimal = decimal;
    }

    public void setMilesValue(int miles){
        this.miles = miles;
    }
}

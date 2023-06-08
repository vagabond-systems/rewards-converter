import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    private double cashValue;
    private double miles;

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
        double newRate = .35 * 100;
        double rate =  newRate + 100;
        double quotient = 100 / rate;
        double product = quotient * miles;

//        System.out.println("This is newRate: " + newRate);
//        System.out.println("This is rate: " + rate);
//        System.out.println("This is quotient: " + quotient);
//        System.out.println("This is product: " + product);

        BigDecimal bd = BigDecimal.valueOf(product * 100);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

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

    public double getMilesValue(){
        return miles;
    }

    public double convertFromCashToMiles(){
        double product = cashValue * 0.35;
        double sum = cashValue + product;
        double result = sum / 100;
        BigDecimal bd = BigDecimal.valueOf(result);
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void setMilesValue(double miles){
        this.miles = miles;
    }
}

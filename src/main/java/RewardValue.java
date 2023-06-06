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
        double rate = miles * 100;
        double product = rate * .35;
        double difference = rate - product;
        //double result = rate - difference;

        System.out.println("This is rate: " + rate);
        System.out.println("This is product: " + product);
        System.out.println("This is difference: " + difference);
        //System.out.println("This is result: " + result);

        BigDecimal bd = new BigDecimal(String.valueOf(difference));
        bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("This is BD: " + bd.doubleValue());
        return bd.doubleValue();
    }

    public void setCashValue(double cashValue){
        this.cashValue = cashValue;
    }

    public double getMilesValue(){
        double product = cashValue * 0.35;
        double sum = cashValue + product;
        double result = sum / 100;
        BigDecimal bd = new BigDecimal(String.valueOf(result));
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void setMilesValue(double miles){
        this.miles = miles;
    }
}

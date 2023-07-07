public class RewardValue {
    double conversionRate = 0.0035;
    double valuePoints;
    int valueMiles;
    public RewardValue(double cash) {
        this.valuePoints = cash;
    }
    public RewardValue(int miles){
        this.valueMiles =  miles;
        this.valuePoints = miles / conversionRate;

      System.out.println(miles);
    }
    public double getCashValue(){

      return valuePoints ;
    }
    public double getMilesValue(){

      return valueMiles ;
    }
}

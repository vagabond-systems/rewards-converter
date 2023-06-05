public class RewardValue {
    private double cash;
    private double miles;

    public RewardValue(double cash){
        this.cash = cash;

    }
    public RewardValue(int miles){
        this.miles = miles;

    }

    public double getCashValue(){
        return this.cash;
    }

    public double getMilesValue(){
        return this.miles;
    }

    public double convertFromCashToMiles(){
       return miles = getCashValue()*0.0035;

    }
    public double convertFromMilesToCash(){
        return cash = getMilesValue()/0.0035;
    }
}
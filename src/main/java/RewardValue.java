public class RewardValue {
    final double cash;
    final double miles;
    public RewardValue(double cashInput){
        this.cash = cashInput;
        this.miles = cashToMiles(cashInput);
    }
    public RewardValue(int milesInput){
        this.miles = milesInput;
        this.cash = milesToCash(milesInput);
    }
    private double cashToMiles(double cashInput){
        return cashInput / 0.0035;
    }
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }
    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        return miles;
    }
}

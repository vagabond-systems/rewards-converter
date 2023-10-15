public class RewardValue {
    private double cash;
    private double miles;
    RewardValue(double cash){
        this.cash = cash;
        this.miles = cash/0.0035;
    }
    RewardValue(double miles,boolean m){
        if(m) {
            this.miles = miles;
            this.cash = miles * 0.0035;
        }
    }
    double getCashValue(){
        return cash;
    }
    double getMilesValue(){
        return miles;
    }
}

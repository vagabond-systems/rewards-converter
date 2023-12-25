public class RewardValue{
    double cash;
    double miles;
    double RATE = 0.0035;
    public RewardValue(double cash){
        this.cash = cash;
        this.miles = cash/RATE;
    }
    public RewardValue(double miles, boolean isMile){
        if(isMile){
            this.miles = miles;
            this.cash = miles*RATE;
        }
    }
    double getCashValue(){
        return this.cash;
    }
    double getMilesValue(){
        return this.miles;
    }
}
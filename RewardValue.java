public class RewardValue {

    double cash;
    double miles;
    const double RATIO = 0.0035;
    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return this.miles * RATIO
    }

    public double getMilesValue(){
        return this.cash * RATIO;
    }
}

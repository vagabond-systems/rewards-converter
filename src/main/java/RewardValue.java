public class RewardValue {
    double cash;
    int miles;
    RewardValue(double cash){
        this.cash = cash;
    }

    RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        double convertedMiles = cash*.0035;
        return convertedMiles;
    }
}

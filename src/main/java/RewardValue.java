public class RewardValue {
    double cash;
    int miles;
    RewardValue(double cash){
        this.cash = cash;
        // I'm aware of truncation in this instance, but that seems to not be the point of the exercise.
        this.miles = (int)(cash / 0.0035);
    }

    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * 0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }
}

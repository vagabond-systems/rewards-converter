public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cash){
        assert (cash >= 0);
        this.cash = cash;
        this.miles = (int) (cash * 285.71);

    }

    public RewardValue(int miles){
        assert (miles >= 0);
        this.miles = miles;
        this.cash = miles * 0.0035;

    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue(){
        return miles;
    }
}

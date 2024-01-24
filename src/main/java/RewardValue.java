public class RewardValue {
    private final double cash, miles;
    final double  milesToCashRate = 0.0035;

    RewardValue(double cash)
    {
        this.cash = cash;
        this.miles =  (this.cash / milesToCashRate);
    }

    RewardValue(int miles)
    {
        this.miles = miles;
        this.cash = (milesToCashRate * this.miles);
    }

    double getCashValue()
    {
        return this.cash;
    }

    double getMilesValue()
    {
        return this.miles;
    }

}

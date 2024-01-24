public class RewardValue {
    final double  milesToCashRate = 0.0035;
    double cash, miles;
    RewardValue(double cash)
    {
        this.cash = cash;
        this.miles =  (this.cash / milesToCashRate);
    }

    RewardValue(float miles)
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

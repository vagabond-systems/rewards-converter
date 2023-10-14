public class RewardValue {
    double cash;
    int miles;

    RewardValue(double cash)
    {
        this.cash = cash ;
    }

    RewardValue(int miles)
    {
        this.miles = miles ;
    }

    int getMilesValue()    {
        return (int) (cash*0.0035);
    }

    double getCashValue()
    {
        return miles*0.0035;
    }
}


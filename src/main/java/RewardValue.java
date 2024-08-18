
public class RewardValue
{
    double cash;
    double miles;
    RewardValue(int mile)
    {
        this.miles = mile;
        this.cash = milestocash(miles);
    }

    public double milestocash(double miles) {
        return 0.0035*miles;
    }

    public RewardValue(double cash )
    {
        this.cash = cash;
        this.miles=cashtomiles(cash);

    }

    public double cashtomiles(double cash)
    {
        return cash/0.0035;
    }

    public double getCashValue()
    {
        return cash ;
    }

    public double getMilesValue()
    {
        return miles ;
    }

    // @Override
    //  String toString()
    //  {
    //     return(cash);
    //  }

    public static void main(String[] args)
    {
        RewardValue a =new RewardValue(100.0);
        System.out.println("cash value :" + a.cash);
        System.out.println("cash to mile :" + a.getMilesValue());
    }
}
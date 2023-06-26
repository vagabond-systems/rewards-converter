public class RewardValue {
    // constructor overloading, 2 - one parameter constructors
    double cashValue;
    int milesValue;
    public RewardValue(double cash)
    {
        // creates constructor to accept cash value as type 'double'
        this.cashValue = cash;
    }

    public RewardValue(int miles)
    {
        // creates constructor to accept miles value as type 'int'
        this.milesValue = miles;
    }

    public double getCashValue()
    {
        // returns cashValue entered, ensures an acceptable value is entered through testing
        return cashValue;
    }

    public int getMilesValue()
    {
        // converts a give cash value to a mile value at a rate of 1:285.714, returns a mile value of type 'int' (typecast)
        milesValue = (int) (cashValue / 0.0035);
        return milesValue;
    }

}

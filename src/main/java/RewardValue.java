public class RewardValue {
    public double cash;
    public double miles;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    /* Returns the value of the miles reward in cash */
    public double getCashValue(){
        return this.miles * 0.0035;
    }

    /* Returns the value of the cash reward in miles */
    public double getMilesValue(){
        return this.cash / 0.0035;
    }
}

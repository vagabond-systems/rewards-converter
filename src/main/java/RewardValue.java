public class RewardValue {
    double cashValueVar;
    public RewardValue(double cashValue){
        this.cashValueVar = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValueVar = milesValue * 0.0035;
    }

    public double getCashValue(){
        return cashValueVar;
    }

    public double getMilesValue(){
        return (int) (cashValueVar / 0.0035);
    }
}

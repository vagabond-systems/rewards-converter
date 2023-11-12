public class RewardValue {
    private double cashValue;
    public RewardValue(double value){
            this.cashValue = value;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return cashValue/0.0035;
    }

}

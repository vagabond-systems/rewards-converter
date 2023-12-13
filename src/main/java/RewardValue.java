public class RewardValue {

    private double cash;

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return this.cash * 0.0035;
    }


    RewardValue(double cashValue){
        this.cash = cashValue;
    }
    RewardValue(int milesValue ){
        this.cash = milesValue / 0.0035;
    }

}

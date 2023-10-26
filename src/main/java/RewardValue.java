public class RewardValue {


    private final Double cashValue;
    private final int milesValue;

    public RewardValue(Double cashValue) {
        this.cashValue=cashValue;
        this.milesValue=(int)(cashValue/0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue=milesValue;
        this.cashValue=milesValue*0.0035;
    }

    Double getCashValue(){
        return cashValue;
    }

    int getMilesValue(){

        return milesValue;
    }
}

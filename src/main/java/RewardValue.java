public class RewardValue {
    private Double cashValue;
    private int milesValue;
    private final Double rate = 0.0035;

    RewardValue(Double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / rate);
    }

    RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * rate;
    }

    // Getters/Setters

    void setCashValue(Double cashValue){
        cashValue = this.cashValue;
    }

    double getCashValue(){
        return this.cashValue;
    }

    void setMilesValue(int milesValue){
        this.milesValue = milesValue;
    }

    int getMilesValue(){
        return this.milesValue;
    }
}

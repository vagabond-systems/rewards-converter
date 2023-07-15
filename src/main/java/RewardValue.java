public class RewardValue {
    double cashValue;
    int milesValue;

    RewardValue(){}
    RewardValue(double cashValue){
        this.setCashValue(cashValue);
        // this.setMilesValue(milesValue);
        int converted = (int)(cashValue/0.0035);
        this.setMilesValue(converted);
    }

    RewardValue(int milesValue){
        this.setMilesValue(milesValue);
        double converted = (double)(milesValue * 0.0035);
        this.setCashValue(converted);
    }
    

    public static void main(String[] args){

    }

    public double getCashValue() {
        return cashValue;
    }

    public double setCashValue(double cashValue) {
        return this.cashValue = cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }

}
public class RewardValue {

    double cashValue;
    double rate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }


    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / rate);
    }

    public double convertToCash(int miles){
        return miles * rate;
    }




}

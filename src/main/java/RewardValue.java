public class RewardValue {
    double cashValue;

    public RewardValue(double cash){
        cashValue = cash;
    }

    public RewardValue(int miles){
        this.cashValue = convertToCash(miles);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue /0.0035);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return convertToMiles(this.cashValue);
    }



}

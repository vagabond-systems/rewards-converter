public class RewardValue {

    public double cash;
    public int miles;

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = convertToMiles(cash);
    }
    public RewardValue(int miles){
        this.miles = miles;
        this.cash = convertToCash(miles);
    }

    public double getCash() {
        return cash;
    }

    public int getMiles() {
        return miles;
    }


    private int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    public double getCashValue(){
        return  cash;
    }

    public double getMilesValue(){
        return  miles;
    }
}

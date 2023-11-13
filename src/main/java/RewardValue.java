public class RewardValue {

    private double cashValue;
    private int miles;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.miles = convertToMiles(cashValue);
    }

    RewardValue(int miles){
        this.miles = miles;
        this.cashValue = convertToCash(miles);
    }

    double getCashValue(){
        return this.cashValue;
    }
    int getMilesValue(){
        return this.miles;
    }

    // Method to convert miles to cash
    private double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    // Method to convert cash to miles
    private int convertToMiles(double cashValue) {
        return (int)(cashValue / 0.0035);
    }
}

public class RewardValue {

    private double cashValue;
    private double miles;
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
    double getMilesValue(){
        return this.miles;
    }

    // Method to convert miles to cash
    private double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    // Method to convert cash to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }
}

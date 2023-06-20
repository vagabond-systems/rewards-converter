public class RewardValue {
    //create constant variables
    private final double value;
    private final double miles_to_cash_rate = .0035;

    //create 2 constructors; one taking in a cashValue and other taking milesValue
    public RewardValue(double cashValue){
        //set this.value to equal the double type value as cash
        //this refers to the instance a new class is instantiated with an argument passed in
        this.value = cashValue;
    }
    public RewardValue(int milesValue){
        //set this.value to equal the int type value as miles
        //this refers to the instance a new class is instantiated with an argument passed in
        this.value = convertToCash(milesValue);
    }

    public double convertToCash(int milesValue){
        return milesValue * miles_to_cash_rate;
        //returns a double type value; method converts miles into cash by multiplying the value by the mile rate
    }

    public int convertToMiles(double cashValue){
        var miles = cashValue / miles_to_cash_rate;
        return (int) (miles);
        //returns an int type value; method converts cash to miles by dividing the cashValue by the mile rate
    }
    public double getCashValue(){
        //method returns a double type value (cash);
        return this.value;
    }
    public int getMilesValue(){
        //method returns an int type value (miles)
        return convertToMiles(this.value);
    }
}

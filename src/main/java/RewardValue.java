public class RewardValue {

    Double value;

    //create a constructor taking a double value as an argument
    //this.value will refer to double value declared in RewardValue class and assign the value passed in the constructor
    public RewardValue(double value){
        this.value = value;
    }
    //getCashValue method returns the value that is passed in the constructor
    public double getCashValue(){
        return this.value;
    }
    //getMilesValue method converts the miles to cash at a rate of .0035 per mile
    //returns the value from the calculation
    public double getMilesValue(){
        double rate = .0035;
        return rate * this.value;
        //or
        //return .0035 * this.value
    }
}

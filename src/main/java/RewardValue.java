public class RewardValue {

    private int miles;
    private double cashValue;

    // Constructor that takes cashValue as a parameter
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.miles = (int)(cashValue/0.0035);
    }

    // Constructor that takes miles as a parameter
    RewardValue(int miles){
        this.miles = miles;
        this.cashValue = miles*0.0035;
    }

    // Return cash value of RewardValue
    public double getCashValue(){
        return cashValue;
    }

    // Return how many miles RewardValue is worth
    public double getMilesValue(){
        return miles;
    }
}
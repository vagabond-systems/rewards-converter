public class RewardValue {
    private double cashAmount; //private field initializer 
    private double amountOfMiles; // private field initlalizer

    public RewardValue(double inputValue){
        double rate = 0.0035;
        amountOfMiles = inputValue * rate;
    }
    public RewardValue(int input_value2){
        int rate = 2000;
        int Amount = input_value2 ;
        cashAmount = Double.valueOf(Amount) / rate;
    }

    public double getCashValue() {
        return cashAmount;
    }

    public double getMilesValue(){
        return amountOfMiles;
    }
}

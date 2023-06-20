public class RewardValue{

    double cash;
    double miles;
    
    //constructor method
    public RewardValue(double cash){
        this.cash = cash;
    }
    //Accessor Methods
    public double getCashValue(){
        return this.cash;
    }
    public double getMilesValue(){
        return this.cash * .0035;
    }
}


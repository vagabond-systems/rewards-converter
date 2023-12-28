public class RewardValue{
    double miles;
    double cashValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.miles = cashValue * 0.0035;
    }

    public RewardValue(int miles){
        this.miles = miles;
        this.cashValue = miles / 0.0035;
    }


    public double getCashValue(){
        return this.cashValue;
    }

    public double getMilesValue(){
        return this.miles;
    }
;}

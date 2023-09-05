public class RewardValue {

    public double cash;
    public double miles;

    RewardValue(double cash){

        this.cash = cash;
    }

    RewardValue(int miles){


        this.miles = miles;
    }



    public double getCashValue(){

        return cash;
    }

    public double getMilesValue(){

        return getCashValue() * 0.0035;
    }
}

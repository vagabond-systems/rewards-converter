public class RewardValue {

    public double cash;
    public double miles;


    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }


    public RewardValue(int miles) {
        this.cash = 0.0035 * miles;
        this.miles = miles;
    }


//    I'm not providing getters and setters but in case they are needed
//    it would be similar to the constructor:
//    public void setMiles( double miles){
//    this.miles = miles;
//    this.cash = miles * 0.0035;
//    }


    public double getCashValue(){
        return cash;
    }


    public double getMilesValue() {
        return miles;
    }

}

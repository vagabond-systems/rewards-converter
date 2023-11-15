public class RewardValue {
//    variables:
    private double cashValue;
    private double milesValue;

//    constructor accepting cash val
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

//    constructor accepting val in miles
    public RewardValue(double milesValue, boolean isMiles){
        if(isMiles){
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        } else {
            System.out.println("Constructor error");
        }
    }

//    Getter
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

//    convert miles to cash
    private double convertToCash(double milesValue){
        return milesValue * 0.0035;
    }

//    convert cash to miles
    private  double convertToMiles(double cashValue){
        return cashValue / 0.0035;
    }
}

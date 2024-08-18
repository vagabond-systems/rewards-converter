public class RewardValue {
    double cash;
    public RewardValue (double cash){
        this.cash=cash;
    }

    public RewardValue (int  miles){
        this.cash = convertToCash(miles);
    }

    int convertToMiles(double cash){
        return (int) (cash/0.0035);
    }

    double convertToCash(int miles){
        return miles*0.0035;
    }

    int getMilesValue(){
        return (int) (this.cash/0.0035);
    }
    double getCashValue(){
        return this.cash;
    }
}
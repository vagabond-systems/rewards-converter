

public class RewardValue {
    double cash;
    int miles;
    public RewardValue(double cash) {
        this.cash=cash;
        this.miles= (int) (this.cash/0.0035);
    }

    public RewardValue(int miles) {
        this.miles=miles;
        this.cash=this.miles*0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }



}

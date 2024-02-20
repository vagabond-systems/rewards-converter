public class RewardValue {
    double cash ;
    int miles;
    RewardValue(double c){
        cash=c;
        miles= (int) Math.round(cash / 0.0035);
    }
    RewardValue(int m){
        miles=m;
        cash=miles*0.0035;
    }
    double getCashValue() {
        return cash;
    }
    int getMilesValue() {
        return miles;
    }

}

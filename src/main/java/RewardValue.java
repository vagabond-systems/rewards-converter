public class RewardValue {
    double c;
    RewardValue(double cash){
        c=cash;
    }
    double getMilesValue(){
        return (c/0.0035);
    }
}
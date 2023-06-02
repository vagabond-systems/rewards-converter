public class RewardValue {
    RewardValue(double cash){
        Cash = cash;
        Miles = Cash / 0.0035;
    }
    RewardValue(int miles){
        Miles = miles;
        Cash = Miles * 0.0035;
    }
    double getCashValue(){
        return Cash;
    }
    double getMilesValue(){
        return Miles;
    }
    double Cash;
    double Miles;
}

public class RewardValue {
    double cashValue;
    int miles;
    public RewardValue(double cv) {
        this.cashValue = cv;
    }
    public RewardValue(int ms) {
        this.miles = ms;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue(){
        int answer = (int)(this.cashValue/0.0035);
        return answer;
    }
}

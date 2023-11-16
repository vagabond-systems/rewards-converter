public class RewardValue {
    private double in;
    public RewardValue(double in){
        setInput(in);
    }
    public void setInput(double c){
        this.in=c;
    }

    public double getCashValue() {
        return in*0.0035;
    }

    public double getMilesValue() {
        return in/0.0035;
    }
}

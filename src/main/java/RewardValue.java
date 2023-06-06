public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double c) {
        cash = c;
        miles = (int)(c/0.0035);
    }

    public RewardValue(int m){
        miles = m;
        cash = m*0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }

    public static void main (String[] args){
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        System.out.println(milesValue);
        System.out.println(rewardValue.getMilesValue());
    }
}

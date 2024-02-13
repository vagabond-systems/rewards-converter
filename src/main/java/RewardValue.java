public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue(double cash){
        this.cash=cash;
        this.miles=(int) (cash/0.0035);
    }

   public RewardValue(int miles){
        this.miles=miles;
        this.cash=miles * 0.0035;
   }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }





}

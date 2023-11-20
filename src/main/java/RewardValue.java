public class RewardValue {

    private float miles;
    private double cash;

    public RewardValue(double cash) {
        this.cash = cash;
        cashToPoints(cash);

    }



    public double getCashValue() {
        return cash;
    }






    public RewardValue(float miles){
        this.miles = miles;
    }
    public float getMilesValue(){
        return miles;
    }

    private void cashToPoints(double cash){

        this.miles = (float) (cash*.0035);

    }

}

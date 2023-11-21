public class RewardValue {

    private float miles;
    private double cash;

    public RewardValue(double cash) {
        this.cash = cash;
        cashToMiles(cash);

    }



    public double getCashValue() {
        return this.cash;
    }






    public RewardValue(float miles){
        this.miles = miles;
        milesToCash(miles);
    }

    public float getMilesValue(){
        return this.miles;
    }

    private void cashToMiles(double cash){

        this.miles = (float) (cash*.0035);
    }

    private void milesToCash(float miles){

        this.cash = miles/.0035F;
        System.out.println(this.cash);
    }

}

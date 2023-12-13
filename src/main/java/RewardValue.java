public class RewardValue {
    private static int milesValue;
    private static double cashValue;



    public RewardValue(double cashValue) {
       this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;

    }

   public static double convertToCash(){
      return  milesValue * convertToMiles();
   }

   public static double convertToMiles(){
       return cashValue / convertToCash();

   }


    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}

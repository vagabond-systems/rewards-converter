public class RewardValue {
    private static int milesValue;
    private static double cashValue;

    private static double ConversionMilesToCashRates = 0.0035;



    public RewardValue(double cashValue) {
       this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;

    }

   public static double convertToCash(int milesValue){
      return  RewardValue.milesValue * ConversionMilesToCashRates;
   }

   public static double convertToMiles(double cashValue){
       return RewardValue.cashValue /ConversionMilesToCashRates;

   }


    public double getCashValue() {
        return convertToCash(milesValue);
    }

    public int getMilesValue() {
        return (int) convertToMiles(cashValue);
    }
}

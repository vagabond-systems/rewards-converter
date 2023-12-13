public class RewardValue {
    private static int milesValue;
    private static double cashValue;

    private static double ConversionMilesToCashRates = 0.0035;



    public RewardValue(double cashValue) {// const
        this.cashValue = cashValue;
        convertToMiles(cashValue);

    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        convertToCash(milesValue);

    }

   private void convertToCash(int milesValue){
      this.cashValue = (double) milesValue * ConversionMilesToCashRates;
   }

   private void convertToMiles(double cashValue){
       this.milesValue = (int) (cashValue / ConversionMilesToCashRates);

   }



    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}


public class RewardValue {
    private double cashValue;
    private final double CONVERSIONRATE = 0.0035;


    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue = convert_from_miles_to_cash(milesValue);
    }
   
    public int convert_from_cash_to_miles(double cashValue){
        return (int)(cashValue/CONVERSIONRATE);
    }

   public double convert_from_miles_to_cash(int milesValue){
        return (milesValue*CONVERSIONRATE); 
    }

    public double getCashValue() {return cashValue;}
    public int getMilesValue() {return convert_from_cash_to_miles(this.cashValue);}
   

}


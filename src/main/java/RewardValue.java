package jpmorgan_virtual_JS;

public class RewardValue {
	private double cashValue;
    private int milesValue;
    
    public RewardValue(double cashValue) {
    	this.cashValue = cashValue;
    	this.milesValue = convertCashToMiles(cashValue);
    }
    
    public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
    }
	
    public double getCashValue() {
    	return cashValue;
    }
    
    public int getMilesValue() {
    	return milesValue;
    }
    
    
    private int convertCashToMiles(double cashValue){
    	 final double MILES_PER_DOLLAR = 285.71; // 1 dollar = 285.71 miles
         return (int) Math.round(cashValue * MILES_PER_DOLLAR);
    }
    
    private double convertMilesToCash(double milesValue) {
        final double CASH_PER_MILE = 0.0035; // 1 mile = 0.0035 dollars
        return milesValue * CASH_PER_MILE;
    }
}

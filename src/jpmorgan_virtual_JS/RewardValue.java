package jpmorgan_virtual_JS;

public class RewardValue {
	private double cashValue;
    private double milesValue;
    
    public RewardValue(double cashValue) {
    	this.cashValue = cashValue;
    	this.milesValue = convertCashToMiles(cashValue);
    }
    
    public RewardValue(double milesValue, boolean isMiles) {
    	if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            throw new IllegalArgumentException("The boolean flag must be true for miles value constructor.");
        }
    }
	
    public double getCashValue() {
    	return cashValue;
    }
    
    public double getMilesValue() {
    	return milesValue;
    }
    
    
    private double convertCashToMiles(double cashValue){
    	 final double MILES_PER_DOLLAR = 285.71; // 1 dollar = 285.71 miles
         return cashValue * MILES_PER_DOLLAR;
    }
    
    private double convertMilesToCash(double milesValue) {
        final double CASH_PER_MILE = 0.0035;
        return milesValue * CASH_PER_MILE;
    }
}

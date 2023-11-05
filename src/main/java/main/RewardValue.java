package main;

/*
 * flight reward converter: converts miles values to cash values and vice versa.
 */
public class RewardValue {
	
	//mile to cash conversion rate
	private final double MILE_TO_CASH_RATE = 0.0035;
	
	//cash value instance variable
	private double cashValue;
	
	//miles value instance variable
	private int mileValue;
	
	//constructor that instantiates the cashValue
	public RewardValue(double cashValue) {
		
		this.cashValue = cashValue;
	}
	
	//constructor that instantiates the miles
    public RewardValue(int mileValue) {
    	this.mileValue = mileValue;
    }
    
    //method that returns the cash equivalence of reward value
    public double getCashValue() {
    	
    	 return (mileValue * MILE_TO_CASH_RATE)/1;
    }
    
    //method that returns the miles equivalence of cash value
    public int getMilesValue() {
    	
    	return (int) ((cashValue * 1)/MILE_TO_CASH_RATE);
    }
}

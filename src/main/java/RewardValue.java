public class RewardValue{
	private double cashValue;
	private int miles;
	
	// defines first constructor that accepts cash
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
		this.miles = 0;
	}
	
	// defines second constructor that accepts miles
	public RewardValue(int miles) {
		this.miles = miles;
		this.cashValue = 0;
	}
	
	// getter method for cash value
	public double getCash() {
		return cashValue;
	}
	
	// getter method for miles value
	public int getMiles() {
		return miles;
	}
	
	public int getCashValue() {
		return (int) (miles * 0.0035);
	}
	
	public double getMilesValue() {
		return (int) (cashValue / 0.0035);
	}
	
}
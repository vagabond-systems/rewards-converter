public class RewardValue {
	private double cashValue;
	private int milesValue;
	
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
	}
	
	public RewardValue(int milesValue) {
		this.milesValue = milesValue;
	}
	
	public double getCashValue() {
		return milesValue * 0.0035;
	}
	
	public double getMilesValue() { 
		return (double)(cashValue) / 0.0035;
	}
}
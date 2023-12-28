
public class RewardValue {
	
	double cashValue;
	int milesValue;
	
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
	}
	
	public RewardValue(int milesValue) {
		this.milesValue = milesValue;
	}
	
	public double getCashValue() {
		double cash = milesValue * 0.0035; 
		return cash;
	}
	
	public int getMilesValue() {
		int miles = (int) (cashValue / 0.0035);
		return miles;
	}
	
}


public class RewardValue {
	
	private double cash;
	private int miles;

	public RewardValue(double cashValue) {
		cash = cashValue;
	}
	
	public RewardValue(int milesValue) {
		miles = milesValue;
	}
	
	public double getCashValue() {
		double cashReward = miles * 0.0035;
		return cashReward;
	}
	
	public double getMilesValue() {
		double milesReward = cash/0.0035;
		return milesReward;
	}
}

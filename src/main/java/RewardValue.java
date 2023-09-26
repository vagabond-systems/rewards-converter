
public class RewardValue {
	private double cash;
	public static final double RATIO = 0.0035;
	public RewardValue(double cVal) {
		this.cash = cVal;
	}
	public RewardValue(int mVal) {
		this.cash = MilesToCash(mVal);
	}
	public static double MilesToCash(int miles) {
		return miles * RATIO;
	}
	public static int CashToMiles(double cash2) {
		return (int)(cash2 / RATIO);
	}
	public double getCashValue() {
		return this.cash;
	}
	public int getMilesValue() {
		return CashToMiles(this.cash);
	}
}

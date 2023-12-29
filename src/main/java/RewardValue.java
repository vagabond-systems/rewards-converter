
public class RewardValue {
	
	private double cashValue;
	private int milesValue;
	
	public static final double CONVERSION_RATE = 0.0035;
	
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
		this.milesValue = convertToMiles(cashValue);
	}
	
	public RewardValue(int milesValue) {
		this.milesValue = milesValue;
		this.cashValue = convertToCash(milesValue);
	}
	
	private static int convertToMiles(double cashValue) {
		return (int)(cashValue / CONVERSION_RATE);
	}
	
	private static double convertToCash(int milesValue) {
		return (milesValue * CONVERSION_RATE);
	}
	
	public double getCashValue() { 
		return cashValue;
	}
	
	public int getMilesValue() {
		return milesValue;
	}
	
}

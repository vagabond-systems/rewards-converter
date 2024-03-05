

public class RewardValue{
	private double cashValue;
	private int milesValue;
	
	// defines first constructor that accepts cash
	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
	}
	
	// defines second constructor that accepts miles
	public RewardValue(int milesValue) {
		this.milesValue = milesValue;
	}
	
	// getter method for cash value
	public double getCashValue() {
		return cashValue;
	}
	
	// getter method for miles value
	public int getMilesValue() {
		return milesValue;
	}
	
	public int convertToCash() {
		return (int) (milesValue * 0.0035);
	}
	
	public double convertToMiles() {
		return (int) (cashValue / 0.0035);
	}
	
}

//Model Answer:
//public class RewardValue {
//    private final double cashValue;
//    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
//
//    public RewardValue(double cashValue) {
//        this.cashValue = cashValue;
//    }
//
//    public RewardValue(int milesValue) {
//        this.cashValue = convertToCash(milesValue);
//    }
//
//    private static int convertToMiles(double cashValue) {
//        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
//    }
//
//    private static double convertToCash(int milesValue) {
//        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
//    }
//
//    public double getCashValue() {
//        return cashValue;
//    }
//
//    public int getMilesValue() {
//        return convertToMiles(this.cashValue);
//    }
//}
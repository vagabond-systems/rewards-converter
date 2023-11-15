public class RewardValue {
	double cashValue;
	double mileage;
	
	public RewardValue(double cashValue) { // accepts cash value
		this.cashValue = cashValue; 
	
	}

	public RewardValue() { // accepts value in miles

	}

	public String getCashValue() {
		// returns cash value of the RewardValue
		return null;
	}
	
	public double getMilesValue() {
		// returns miles
		mileage = cashValue * 0.0035;
		return mileage;
	}


}

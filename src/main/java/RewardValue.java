public class RewardValue {
	private double cashValue;
	private double miles_to_cash_conversionRate = 0.0035;
	
	public RewardValue() {
	}

	public RewardValue(double cashValue) {
		this.cashValue = cashValue;
	}
	public RewardValue(int milesValue)	{
		this.cashValue = milesValue * miles_to_cash_conversionRate;
	}
	
	/*
	public RewardValue(double cashValue) {
		super();
		this.cashValue = cashValue;
	}
	*/
	public double getConversionRate()	{
		return miles_to_cash_conversionRate;
	}
	public double getCashValue() {
		return cashValue;
	}
	public int getMilesValue()	{
		return (int) (cashValue/miles_to_cash_conversionRate);
	}
}

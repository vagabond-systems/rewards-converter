
public class RewardValue {

	public Double cash;
	public Integer miles;
	public RewardValue(double cash) {
		this.cash=cash;
	}
	public RewardValue(int miles) {
		this.miles=miles;
	}
	public double getCashValue() {
		if(cash!=null) {
			return cash.doubleValue();
		}
			return convertMilesToCash(miles);
		
		
	}
	public int getMilesValue() {
		if(miles!=null) {
			return miles.intValue();
		}
			return convertCashToMiles(cash);
	}
	public int convertCashToMiles(double cash) {
		return (int)((this.cash)/(0.0035));
	}
	public double convertMilesToCash(int miles) {
		return this.miles*(0.0035);
	}
	
}

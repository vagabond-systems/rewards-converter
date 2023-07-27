package src.main.java;

public class RewardValue {

	private double cash;
	private long miles;

	private static final double RATE = 0.0035;

	public RewardValue(double cash) {
		this.cash = cash;
		this.miles = cashToMiles(cash);
	}

	public RewardValue(int miles) {
		this.miles = miles;
		this.cash = milesToCash(miles);
	}

	private long cashToMiles(double cash) {
		return (long) (cash / RATE);
	}

	private double milesToCash(int miles) {
		return miles * RATE;
	}

	public long getMilesValue() {
		return miles;
	}

	public double getCashValue() {
		return cash;
	}

}

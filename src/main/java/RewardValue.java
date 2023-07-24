package src.main.java;

import java.text.DecimalFormat;

public class RewardValue {
	
	private double cash;
	private int miles;
	
	private static final double RATE = 0.0035;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public RewardValue(double cash) {
		this.cash = cash;
		this.miles = cashToMiles(cash);
	}

	public RewardValue(int miles) {
		this.miles = miles;
		this.cash = milesToCash(miles);
	}
	
	private int cashToMiles(double cash) {
		return (int) (cash / RATE);
	}
	
	private double milesToCash(int miles) {
		return miles * RATE;
	}
	
	public int getMilesValue() {
		return miles;
	}
	
	public double getCashValue() {
		return cash;
	}

}

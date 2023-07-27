package src.test.java;

import org.junit.jupiter.api.Test;

import src.main.java.RewardValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
	
	private static final double RATE = 0.0035;

	@Test
	void create_with_cash_value() {
		double cashValue = 100;
		var rewardValue = new RewardValue(cashValue);
		assertEquals(cashValue, rewardValue.getCashValue());
	}

	@Test
	void create_with_miles_value() {
		int milesValue = 10000;
		var rewardValue = new RewardValue(milesValue);
		assertEquals(milesValue, rewardValue.getMilesValue());
	}

	@Test
	void create_with_cash_zero_value() {
		double cashValue = 0;
		var rewardValue = new RewardValue(cashValue);
		assertEquals(cashValue, rewardValue.getCashValue());
	}

	@Test
	void create_with_miles_zero_value() {
		int milesValue = 0;
		var rewardValue = new RewardValue(milesValue);
		assertEquals(milesValue, rewardValue.getMilesValue());
	}

	@Test
	void convert_from_cash_to_miles() {
		double cashValue = 1234.56;
		long expectedValue = (long) (cashValue / RATE);
		var rewardValue = new RewardValue(cashValue);
		assertEquals(expectedValue, rewardValue.getMilesValue());
	}
	
	@Test
	void convert_from_cash_as_zero_to_miles() {
		double cashValue = 0.0;
		long expectedValue = (long) (cashValue / RATE);
		var rewardValue = new RewardValue(cashValue);
		assertEquals(expectedValue, rewardValue.getMilesValue());	
	}
	
	@Test
	void convert_from_cash_as_max_to_miles() {
		double cashValue = Double.MAX_VALUE;
		long expectedValue = (long) (cashValue / RATE);
		var rewardValue = new RewardValue(cashValue);
		assertEquals(expectedValue, rewardValue.getMilesValue());	
	}
	

	@Test
	void convert_from_miles_to_cash() {
		int milesValue = 1000;
		double expectedValue = milesValue * RATE;
		var rewardValue = new RewardValue(milesValue);
		assertEquals(expectedValue, rewardValue.getCashValue());
	}
	
	@Test
	void convert_from_miles_as_zero_to_cash() {
		int milesValue = 0;
		double expectedValue = milesValue * RATE;
		var rewardValue = new RewardValue(milesValue);
		assertEquals(expectedValue, rewardValue.getCashValue());
	}
	
	@Test
	void convert_from_miles_as_max_to_cash() {
		int milesValue = Integer.MAX_VALUE;
		double expectedValue = milesValue * RATE;
		var rewardValue = new RewardValue(milesValue);
		assertEquals(expectedValue, rewardValue.getCashValue());
	}
}

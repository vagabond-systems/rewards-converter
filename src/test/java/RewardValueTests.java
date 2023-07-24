package src.test.java;

import org.junit.jupiter.api.Test;

import src.main.java.RewardValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

public class RewardValueTests {

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
    void convert_from_cash_to_miles() {
    	double cashValue = 1234.56;
    	var rewardValue = new RewardValue(cashValue);
        assertEquals(rewardValue.getMilesValue(), Math.round(cashValue / 0.0035));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue());
    }
}

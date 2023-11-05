import org.junit.jupiter.api.Test;

import main.RewardValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        
        final double DOLLAR_TO_MILE_RATE = 1/0.0035;
        
        int expectedMilesValue = (int) (cashValue * DOLLAR_TO_MILE_RATE);
        
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        double expectedCashValue = milesValue * 0.0035;
        
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_cash_to_miles() {
    	
    	double cashValue = 0.0035;
    	
    	final double CASH_TO_MILES_RATE   = 1/0.0035;
    	
    	int expectedCashValue = (int)(cashValue * CASH_TO_MILES_RATE);
    	
    	var rewardValue = new RewardValue(cashValue);
    	
        assertEquals(expectedCashValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
    	
    	int mileValue = 1;
    	final double MILE_TO_CASH_RATE = 0.0035;
    	
    	double expectedCashValue = MILE_TO_CASH_RATE * mileValue;
    	var rewardValue = new RewardValue(mileValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}

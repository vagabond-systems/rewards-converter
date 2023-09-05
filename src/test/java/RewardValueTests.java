/*
 * Christopher Tu
 * JPMC Forage SWE Lite Module
 * RewardValueTests.java
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
    void convert_from_cash_to_miles() { //modified test case to check for proper conversion
        double cashValue = 70;
        double expectedMiles = 20000; //70 divided by .0035 = 20000
        //need to know that passing double calls the cashValue constructor
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() { //modified test case to check for proper conversion
        int milesValue = 10000;
        double expectedCash = 35; //10000 multiplied by .0035 = 35
        //need to know that passing double calls the cashValue constructor
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

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


    /**
     * test the constructor's conversion from cash to miles
     * create test cash value, and manually convert to milesvalue
     * create test rewardvalue object, and fetch its milesvalue
     * test equivalency
     */
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double testMiles = cashValue / 0.0035;
        RewardValue testRV = new RewardValue(cashValue);
        assertEquals(testMiles, testRV.getMilesValue());
    }


    /**
     * test the constructor's conversion from miles to cash
     * create test miles value, and manually convert to cashvalue
     * create test rewardvalue object, and fetch its cashvalue
     * test equivalency
     */
    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double testCash = milesValue * 0.0035;
        RewardValue testRV = new RewardValue(milesValue);
        assertEquals(testCash, testRV.getCashValue());
    }
}

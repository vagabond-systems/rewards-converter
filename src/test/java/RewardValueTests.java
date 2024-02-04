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
        RewardValue rewardValue = new RewardValue(milesValue, true);

        assertEquals(milesValue, rewardValue.getMilesValue());

        // Check the calculated cash value based on the conversion rate
    }




    @Test
        void convert_from_cash_to_miles() {
            double cashValue = 10000.0;
            RewardValue reward = new RewardValue(cashValue);
            double expectedMiles = 10000.0 / 0.0035;

            assertEquals(expectedMiles, reward.getMilesValue(), 0.001);
        }

        @Test
        void convert_from_miles_to_cash() {
            double milesValue = 5000.0;
            RewardValue reward = new RewardValue(milesValue, true);
            double expectedCash = 5000.0 * 0.0035;

            assertEquals(expectedCash, reward.getCashValue(), 0.001);
        }
    }

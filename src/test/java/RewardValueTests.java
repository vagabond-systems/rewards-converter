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
    void convert_from_cash_to_miles() {
        double cashAmount = 100.0;
        double conversionRate = 0.1;
        RewardValue rewardValue = new RewardValue(conversionRate);

        double expectedMiles = cashAmount / conversionRate;
        double actualMiles = rewardValue.convertCashToMiles(cashAmount, conversionRate);

        assertEquals(expectedMiles, actualMiles, 0.01);
    }


    @Test
    void convert_from_miles_to_cash() {
            double milesAmount = 500.0;
            double conversionRate = 0.1;
            RewardValue rewardValue = new RewardValue(conversionRate);

            double expectedCash = milesAmount * conversionRate;
            double actualCash = rewardValue.convertMilesToCash(milesAmount, conversionRate);

            assertEquals(expectedCash, actualCash, 0.01);
        }
    }


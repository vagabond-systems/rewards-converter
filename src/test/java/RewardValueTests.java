import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
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
        double inputCashValue = 95.75;
        RewardValue sut = new RewardValue(inputCashValue);
        int expectedMiles = (int) (inputCashValue / MILES_TO_CASH_CONVERSION_RATE);
        int outputMiles = sut.getMilesValue();
        assertEquals(expectedMiles, outputMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        int inputMilesValue = 2500;
        RewardValue sut = new RewardValue(inputMilesValue);
        double expectedCashValue = (inputMilesValue * MILES_TO_CASH_CONVERSION_RATE);
        double outputCashValue = sut.getCashValue();
        assertEquals(expectedCashValue, outputCashValue);
    }
}

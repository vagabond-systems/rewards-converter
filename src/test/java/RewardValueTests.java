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
        double cashValue = 1000;
        RewardValue rewardValue = new RewardValue(cashValue);
        int mileValue = rewardValue.convertToMiles(cashValue);
        assertEquals(mileValue,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 100;               //arrange
        RewardValue rewardValue = new RewardValue(milesValue);

        double cashValue = rewardValue.convertToCash(milesValue);       //act

        assertEquals(cashValue,rewardValue.getCashValue());         //assert
    }
}

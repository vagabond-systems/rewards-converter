import org.junit.jupiter.api.Assertions;
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
        //Arrange
        double cashAmount = 100;
        RewardValue rewardValue = new RewardValue(cashAmount);
        double conversionRate = rewardValue.getCONVERT_RATE();

        //Act
        int convertedMiles = (int) (cashAmount/ conversionRate);
        int result = rewardValue.convertCashToMiles(cashAmount);

        //Assert
        Assertions.assertEquals(convertedMiles, result);

    }

    @Test
    void convert_from_miles_to_cash() {
        //Arrange
        double numberOfMiles = 10000;
        RewardValue rewardValue = new RewardValue(numberOfMiles);
        double conversionRate = rewardValue.getCONVERT_RATE();

        //Act
        int convertedCash = (int) (numberOfMiles *  conversionRate);
        double result = rewardValue.convertMilesToCash((int) numberOfMiles);

        //Assert
        Assertions.assertEquals(convertedCash, result);

    }
}

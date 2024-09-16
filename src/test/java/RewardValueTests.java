import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

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
        BigDecimal milesValue = new BigDecimal(10000);
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue.doubleValue(), rewardValue.getMilesValue());
    }

    // Converted miles datatype from int to BigDecimal as it is more accurate. If we have to represent 3.9 miles with int it is not possible so BigDecimal is a better option.
    @Test
    void convert_from_cash_to_miles() {
       double cashValue = 35;
       var rewardValue = new RewardValue(cashValue);
       double expectedMiles = (cashValue / 0.0035);
       BigDecimal miles = BigDecimal.valueOf(rewardValue.getMilesValue());
       double testMiles = miles.doubleValue();
       assertEquals(expectedMiles, testMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        BigDecimal milesValue = new BigDecimal(35);
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue.doubleValue() * 0.0035;
        double cash = rewardValue.getCashValue();
        assertEquals(expectedCash, cash);
    }
}

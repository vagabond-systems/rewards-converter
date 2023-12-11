import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private static final double DELTA = 0.0001;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), DELTA);
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double milesValueTwo = rewardValue.getMilesValue();
        System.out.println("Miles Value" + milesValueTwo);
        assertEquals(milesValue, milesValueTwo, DELTA);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double milesValue = cashValue * 0.0035;

        assertEquals(milesValue, rewardValue.getMilesValue(), DELTA);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        double cashValue = milesValue / 0.0035;
//        double cashValueTwo = rewardValue.getCashValue();
        System.out.println(cashValue);
        System.out.println(rewardValue.getCashValue());
        assertEquals(cashValue, rewardValue.getCashValue(), DELTA);
    }
}

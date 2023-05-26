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
        double cashValue=100;
        double milesValue =  (cashValue / 0.0035);
        // double mileValue =  RewardValue.getconvertcashtomiles(cashValue);
        RewardValue rewardValue = new RewardValue(cashValue);
        double mileValue = rewardValue.getMilesValue();
        assertEquals(milesValue, RewardValue.getconvertcashtomiles(cashValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue=100;
        double cashValue=(milesValue*0.0035);
        RewardValue rewardValue= new RewardValue(milesValue);
        double cashsValue = rewardValue.getCashValue();
        assertEquals(cashValue, RewardValue.getconvertmilestocash(milesValue));
    }
}

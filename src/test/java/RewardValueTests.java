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
    void convert_from_one_cash_to_miles() {
        double cash = 1;
        int miles = (int) (cash / .0035);
        var rewardValue = new RewardValue(cash);
        assertEquals(miles, rewardValue.getMilesValue());
    }
    @Test
    void convert_from_cash_to_miles() {
        double cash = 250;
        int miles = (int) (cash / .0035);
        var rewardValue = new RewardValue(cash);
        assertEquals(miles, rewardValue.getMilesValue());
    }
    @Test
    void convert_from_max_cash_to_miles() {
        double cash = Integer.MAX_VALUE;
        int miles = (int) (cash / .0035);
        var rewardValue = new RewardValue(cash);
        assertEquals(miles, rewardValue.getMilesValue());
    }
    @Test
    void convert_from_zero_cash_to_miles() {
        double cash = 0;
        int miles = 0;
        var rewardValue = new RewardValue(cash);
        assertEquals(miles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        double cash = miles * .0035;
        var rewardValue = new RewardValue(miles);
        assertEquals(cash, rewardValue.getCashValue());
    }
    @Test
    void convert_from_zero_miles_to_cash() {
        int miles = 0;
        double cash = miles * .0035;
        var rewardValue = new RewardValue(miles);
        assertEquals(cash, rewardValue.getCashValue());
    }
    @Test
    void convert_from_one_miles_to_cash() {
        int miles = 1;
        double cash = miles * .0035;
        var rewardValue = new RewardValue(miles);
        assertEquals(cash, rewardValue.getCashValue());
    }
    @Test
    void convert_from_max_miles_to_cash() {
        int miles = Integer.MAX_VALUE;
        double cash = miles * .0035;
        var rewardValue = new RewardValue(miles);
        assertEquals(cash, rewardValue.getCashValue());
    }
}

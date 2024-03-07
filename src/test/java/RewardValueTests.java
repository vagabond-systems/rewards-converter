import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class
RewardValueTests {
    private static final double RATE=0.0035;


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
        double cash=1000;
        int expectedMiles=(int)(cash/RATE);
        var rewardValue= new RewardValue(cash);
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {

        int miles=1000;
        double expectedCash=miles*RATE;
        var rewawsValue=new RewardValue(miles);
        assertEquals(expectedCash, rewawsValue.getCashValue());
    }
}

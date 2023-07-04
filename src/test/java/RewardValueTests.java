import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
 * This seems to be a test file to create classes to use for the rewards converter. 
 * Not entirely sure why this is here as git branches exist but i imagine
 * it makes things more organized for some.
 */


public class RewardValueTests {

    //essentailly the reward value equals what the cashvalue equals after calculation
    // of the rewards. So it puts the cash value inside of an equation, and 
    //vice versa for create with miles value.
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
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
}

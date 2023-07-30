import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "getCashValue does not return the correct value");
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(),"getMilesValue does not return the correct value");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(28571.428571428572, rewardValue.getMilesValue(),"getMilesValue does not convert the cashAmount correctly");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(35.00, rewardValue.getCashValue(),"getCashValue does not convert the milesValue correctly");
    }

    @Test
    void convert_from_0_miles_to_0_cash() {
        int milesValue = 0;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(0, rewardValue.getCashValue(), "getCashValue does not convert the milesValue correctly");
    }

    @Test
    void convert_from_0_cash_to_0_miles() {
        double cashValue = 0;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(0, rewardValue.getMilesValue(), "getMilesValue does not convert the cashAmount correctly");
    }
    @Test
    void throws_Exception_when_inserting_negative_for_cashValue() {
        double cashValue = -10.25;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RewardValue rewardValue = new RewardValue(cashValue);
        });

        String expectedMessage = "Value inserted cannot be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "IllegalArgumentException was not thrown when inserting negative value for cashValue");
    }
    @Test
    void throws_Exception_when_inserting_negative_for_milesValue() {
        int milesValue = -10000;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RewardValue rewardValue = new RewardValue(milesValue);
        });

        String expectedMessage = "Value inserted cannot be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "IllegalArgumentException was not thrown when inserting negative value for milesValue");
    }

    @Test
    void convert_from_near_zero_cash_to_correct_miles() {
        double cashValue = 0.01;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(2.857142857142857, rewardValue.getMilesValue(), "getMilesValue does not convert the cashAmount correctly");
    }
}

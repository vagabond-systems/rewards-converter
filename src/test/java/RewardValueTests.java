import org.junit.jupiter.api.Test;

import main.java.RewardValue;

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
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }

    // @Test
    // void convert_from_cash_to_miles() {
    //     double cashValue = 100;
    //     var rewardValue = new RewardValue(cashValue);
    //     int expectedMilesValue = (int) (cashValue / RewardValue.getMilesToCashRate()); // Added a getter method for the MILES_TO_CASH_RATE field in the RewardValue class to getting access to MILES_TO_CASH_RATE
    //     // int expectedMilesValue = (int) (cashValue / RewardValue.MILES_TO_CASH_RATE); // MILES_TO_CASH_RATE field being declared as private in the RewardValue class. Private fields are not directly accessible outside the class.
    //     assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    // }

    // @Test
    // void convert_from_miles_to_cash() {
    //     int milesValue = 10000;
    //     var rewardValue = new RewardValue(milesValue);
    //     double expectedMilesValue = (int) (cashValue / RewardValue.getMilesToCashRate()); 
    //     // double expectedCashValue = milesValue * RewardValue.MILES_TO_CASH_RATE; 
    //     assertEquals(expectedCashValue, rewardValue.getCashValue());
    // }
}

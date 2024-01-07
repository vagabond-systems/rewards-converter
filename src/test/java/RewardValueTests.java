<<<<<<< HEAD
import RewardsConverter.java.RewardValue;
=======
>>>>>>> f30cb5e67d23a2059d8e021ea1c6cfcb2e1e68be
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
<<<<<<< HEAD
        RewardValue rewardValue;
        rewardValue = new RewardValue(cashValue);
=======
        var rewardValue = new RewardValue(cashValue);
>>>>>>> f30cb5e67d23a2059d8e021ea1c6cfcb2e1e68be
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
<<<<<<< HEAD
        double cash_to_miles_Value = 100;
        RewardValue rewardValue;
        rewardValue = new RewardValue(cash_to_miles_Value);
        assertEquals(cash_to_miles_Value, rewardValue.getCashValue());
=======
        assert false;
>>>>>>> f30cb5e67d23a2059d8e021ea1c6cfcb2e1e68be
    }

    @Test
    void convert_from_miles_to_cash() {
<<<<<<< HEAD
        int miles_to_cash_Value = 10000;
        var rewardValue = new RewardValue(miles_to_cash_Value);
        assertEquals(miles_to_cash_Value, rewardValue.getMilesValue());
    }
}
//End of testing
=======
        assert false;
    }
}
>>>>>>> f30cb5e67d23a2059d8e021ea1c6cfcb2e1e68be

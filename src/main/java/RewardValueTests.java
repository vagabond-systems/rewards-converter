import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {


    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        Assertions.assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        Assertions.assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash=1000;
        RewardValue reward_obj= new  RewardValue(cash);
        int reward_miles =  (int)(cash/reward_obj.coververdion_rate);
        Assertions.assertEquals(reward_miles, reward_obj.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles=1000;
        RewardValue reward_obj= new RewardValue(miles);
        double rewardcash=miles*reward_obj.coververdion_rate;
        Assertions.assertEquals(rewardcash,reward_obj.getCashValue());

    }
}

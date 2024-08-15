import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
        // assert false;
        double cashValue=100;
        double  expectedMiles=(int)Math.round(cashValue/0.0035);
        var rewardValue=new RewardValue(cashValue);
       assertEquals(expectedMiles,Math.round(rewardValue.getMilesValue()),0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
      int milesValue=1000;
      double expectedCash=milesValue * 0.0035;
      var rewardValue= new RewardValue(milesValue);
      assertEquals(expectedCash, rewardValue.getCashValue(),0.01);
    }
}

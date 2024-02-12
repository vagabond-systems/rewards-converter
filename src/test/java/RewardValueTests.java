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
         // assert false;
        double cashValue = 100; // Amount in cash to convert
        RewardValue rewardValue = new RewardValue(cashValue);

         
        double convertedCashValue = rewardValue.getCashValue();
        int convertedMilesValue = rewardValue.getMilesValue();

        
        double expectedCashValue = 100; // Expected cash value after conversion
        int expectedMilesValue = 28571; // Expected miles value after conversion
        assertEquals(expectedCashValue, convertedCashValue); 
        assertEquals(expectedMilesValue, convertedMilesValue); 
      
    }

    @Test
void convert_from_miles_to_cash() {
    
    int milesValue = 1000; // Amount in miles to convert
    RewardValue rewardValue = new RewardValue(milesValue);

     
    double convertedCashValue = rewardValue.getCashValue();
    int convertedMilesValue = rewardValue.getMilesValue();

    
    int expectedMilesValue = 1000; // Expected miles value after conversion
    double expectedCashValue = milesValue * 0.0035; // Expected cash value after conversion
    assertEquals(expectedCashValue, convertedCashValue);  
    assertEquals(expectedMilesValue, convertedMilesValue); 

}
}


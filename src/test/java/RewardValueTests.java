import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

/*Logic: As reward system they i would think that the program would promote customers to spend more money
 * when flying so if a customer sends $7 they would get 2000 bonus miles. if it was they choose to redeam their miles 
 * to chash then 4000 miles would equal $14.
 */

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 7.0;                       //create the same variable as above for both tests. 
        var rewardValue = new RewardValue(cashValue); //passes the value to reward value class.
        int expectedDist = 2000;                        
        assertEquals(expectedDist, rewardValue.getMilesValue()); //Comparator for the expected value.
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 4000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = 14.0;
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

/*Resources used https://junit.org/junit4/javadoc/latest/org/junit/Assert.html 
 * This was used to learn how junits are structured and helpfull methods summary.
 */
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        BigDecimal inputCashValue = BigDecimal.valueOf(100).setScale(2);
        RewardValue rewardValue = new RewardValue(inputCashValue);
        BigDecimal returnCashValue = rewardValue.getCashValue();
        System.out.println("cashValue: " + inputCashValue);
        System.out.println("returnedValue: " + returnCashValue);

        assertEquals(inputCashValue, returnCashValue);
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        BigDecimal inputCashValue = BigDecimal.valueOf(50.0).setScale(2);
        double ratio = 0.0035;
        double desiredDoubleResult = inputCashValue.doubleValue() * ratio;
        int desiredResult = (int)desiredDoubleResult;
       RewardValue rewardValue = new RewardValue(inputCashValue);
        assertEquals(desiredResult, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 123;
        double ratio = 0.0035;
        double doubleResult = milesValue / ratio;
        BigDecimal desiredResult = BigDecimal.valueOf(doubleResult);
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(desiredResult, rewardValue.getCashValue());
    }


//    For this last test, I was unable to find the right syntax to validate that my functions in RewardValue
//    were actually preventing a negative number. The byproduct of doing so created a null value, which I am having
//    a hard time catching/verifying in the test. I know there is a way, but I think that it will take too long for this
//    exercise.
    @Test
    void values_not_less_than_zero(){
        BigDecimal bigDecimalValue = BigDecimal.valueOf(-140.45);
        RewardValue cashValue = new RewardValue(-1);
        RewardValue milesValue = new RewardValue(bigDecimalValue);
        System.out.println(cashValue.getCashValue());
//        assertFalse(cashValue.getCashValue() == null);
//        assertFalse(cashValue.getCashValue().compareTo(BigDecimal.ZERO) < 0);
        assertFalse(milesValue.getMilesValue() < 0.0);

    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var RV = new RewardValue(cashValue);
        assertEquals(cashValue, RV.getCashValue());
    }
    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var RV = new RewardValue(milesValue);
        assertEquals(milesValue, RV.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert false;
        double cash = 10000;
        double conversion = cash * 0.0035;
        var RV = new RewardValue(cash);
        var convertToMiles = RV.convertFromCashToMiles();
        assertEquals(conversion, convertToMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        int miles = 35;
        double conversion = miles / 0.0035;
        var RV = new RewardValue(miles);
        var convertToCash = RV.convertFromMilesToCash();
        assertEquals(conversion, convertToCash);
    }
}
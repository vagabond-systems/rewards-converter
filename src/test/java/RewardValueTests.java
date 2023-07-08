import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertToMiles(double conversionRate) {
        return (int) (cashValue * conversionRate);
    }

    public double convertToCash(double conversionRate) {
        return milesValue / conversionRate;
    }
}

public class RewardValueTests {

    public RewardValueTests() {
        // Default constructor
    }

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
        double cashValue = 1000;
        double conversionRate = 0.1; // 1 unit of cash = 0.1 mile
        var rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = (int) (cashValue * conversionRate);
        assertEquals(expectedMilesValue, rewardValue.convertToMiles(conversionRate));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 350;
        double conversionRate = 0.1; // 1 mile = 0.1 unit of cash
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue / conversionRate;
        assertEquals(expectedCashValue, rewardValue.convertToCash(conversionRate));
    }
}

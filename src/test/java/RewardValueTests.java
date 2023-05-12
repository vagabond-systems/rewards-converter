import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardValue {
    private final double miles;
    private final double cash;

    public RewardValue(double miles) {
        this.miles = miles;
        this.cash = miles * 0.035;
    }


    public double getMiles() {
        return miles;
    }

    public double getCash() {
        return cash;
    }

    public static RewardValue convertFromCash(double cash) {
        double miles = cash / 0.035;
        return new RewardValue(miles);
    }

    public static RewardValue convertFromMiles(double miles) {
        return new RewardValue(miles);
    }
}

class RewardValueTests {

    @Test
    void create_with_miles_value() {
        RewardValue rewardValue = new RewardValue(10000.0);
        assertEquals(10000.0, rewardValue.getMiles());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue rewardValue = RewardValue.convertFromCash(100.0);
        assertEquals(2857.1428571428573, rewardValue.getMiles(), 0.0001);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue rewardValue = RewardValue.convertFromMiles(1000.0);
        assertEquals(35.0, rewardValue.getCash(), 0.0001);
    }
}

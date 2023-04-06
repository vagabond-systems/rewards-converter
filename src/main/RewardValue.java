public class RewardValue {
   void cash() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    void miles() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }


    void convert_from_cash_to_miles() {
        assert false;
    }


    void convert_from_miles_to_cash() {
        assert false;
    }
}




   



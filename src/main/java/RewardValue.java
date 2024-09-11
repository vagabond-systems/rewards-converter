public class RewardValue {
    private final double cashValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return convertToMiles(this.cashValue);
    }

    public static void main(String[] args) {
        double cashValue = 101.99;
        int milesValue = 1234;

        //Test with a cash value
        RewardValue rewardFromCash = new RewardValue(cashValue);
        System.out.println("Cash value: $" + rewardFromCash.getCashValue());
        System.out.println("Equivalent miles: " + rewardFromCash.getMilesValue() + " miles");

        //Test with a miles value
        RewardValue rewardFromMiles = new RewardValue(milesValue);
        System.out.println("Miles value: " + rewardFromMiles.getMilesValue() + " miles");
        System.out.println("Equivalent cash: $" + rewardFromMiles.getCashValue());
    }

    }

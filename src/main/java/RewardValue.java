public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double milesToCash(int miles) {
        return miles * 0.0035;
    }

    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    public static void main(String[] args) {
        // Test the RewardValue class functionality here
        RewardValue reward1 = new RewardValue(100);
        System.out.println("Cash value: " + reward1.getCashValue());
        System.out.println("Miles value: " + reward1.getMilesValue());
    }
}
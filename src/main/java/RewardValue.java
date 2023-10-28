public class RewardValue{
	private double cash;
	private int miles;

	public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / 0.0035); // Conversion rate: 1 mile = 0.0035 cash
    }

	public RewardValue(int miles) {
        this.miles = miles;
        this.cash = cash * 0.0035; // Conversion rate: 1 mile = 0.0035 cash
    }

    public double getCashValue() {
        return cash;
    }

    // Method to get miles value
    public int getMilesValue() {
        return miles;
    }
}
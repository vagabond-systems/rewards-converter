package main.java;

/**
 * Represents a reward value that can be converted between cash and miles.
 */
public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;

    private final double milesValue;

    /**
     * Constructor that accepts a cash value.
     *
     * @param cashValue The cash value of the reward.
     * @param b
     */
    public RewardValue(double cashValue, boolean b) {
        this.milesValue = cashToMiles(cashValue);
    }

    /**
     * Get how many miles the reward is worth.
     *
     * @return The miles value.
     */
    public double getMilesValue() {
        return milesValue;
    }

    /**
     * Get the cash value of the reward.
     *
     * @return The cash value.
     */
    public double getCashValue() {
        // You need to provide the implementation here.
        // For example, you might calculate the cash value based on miles.
        // Replace this with the actual calculation.
        return milesValue * MILES_TO_CASH_RATE;
    }

    // Convert cash to miles
    private double cashToMiles(double cash) {
        return cash / MILES_TO_CASH_RATE;
    }
}


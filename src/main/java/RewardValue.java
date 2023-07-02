public class RewardValue {
    private double cashAmount; //private field initializer 
    public static final double rate = 0.0035; //Single global verable used 

    /*Used this key work to correct to refrence this methods variable. 
     * REASONING: I ran into trouble find how to pass the junit test and found that 
     * the inital variable was not returning the tested value.
     */
    public RewardValue(double cash){
        this.cashAmount = cash;
    }
    public RewardValue(int input_value2){
        this.cashAmount = input_value2 * rate;
    }

    public double getCashValue() {
        return this.cashAmount;
    }

    public int getMilesValue(){
        return (int) ((int) this.cashAmount / rate);      // Java type casting to refactor code and make it easier to test.
    }                                                     // Looks rough but it works would love to learn and improve with feedback. 
}

/*
* Christopher Tu
* JPMC Forage SWE Lite Module
* RewardValue.java
*/
public class RewardValue {
    private double cashValue;
    private double milesValue;

/*
*   double parameter for cashValue, int for milesValue (defined by RewardValueTests.java)
*   Constructor overloading doesn't work with the same parameter type.
*   External code must know which constructor to call based on value they are passing.
*   RewardValueTests.java was modified to check for proper conversion.
*/
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; //cash to miles is divided 0.0035
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; //miles to cash is multiplied 0.0035
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }
}

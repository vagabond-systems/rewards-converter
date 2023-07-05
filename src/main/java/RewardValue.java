public class RewardValue {
    
    //button to toggle for input for miles or cash.
// Originially I was going to have another class to convert foreign currency to the american dollar. 
//But then I realized, that's going 110% and the focus should be getting the basics down instead of polishing. 
     double ConversionRate = 0.0035;
      private double milesConverted;
      private double cashConverted;
//constructor accepting cash value
     public RewardValue(double cashConverted)
    {
        this.cashConverted = cashConverted;
         milesConverted = cashConverted / ConversionRate;
    }
    //Constructor that accepts value in miles.
    public RewardValue(int milesConverted)
    {
        this.milesConverted = milesConverted;
    cashConverted = milesConverted * ConversionRate;
    }
   // constructor that accepts value in cash

    //method that turns miles into cash at a rate of cash to miles (cash * .0035 = miles)
public double getCashValue()
{
 return cashConverted;
}
//method that turns miles inot cash at a rate of miles to cash (miles / .0035 = cash)
 public double getMilesValue()
{
    //can i just put the milesdouble value equally the value divided by the conversion?
return milesConverted;

}
}

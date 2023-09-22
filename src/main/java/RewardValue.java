//import java.util.Scanner;


public class RewardValue {
    
  public double milesValue;
   

	public RewardValue(double cashValue) {
		this.milesValue = 2*cashValue;	
	}

	public double getMilesValue() {
	 return milesValue; 		
	}
}
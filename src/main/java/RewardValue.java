
public class RewardValue {
	
	Double cashValue;
	
	RewardValue(double cashValue){
		this.cashValue=cashValue;
	}


	public Double getCashValue() {
		// TODO Auto-generated method stub
		return cashValue;
	}

	public Integer getMilesValue() {
		// TODO Auto-generated method stub
		return (int) (cashValue/0.0035);
	}
}


public class RewardValue {
	
	Double cashValue;
	
	RewardValue(double cashValue){
		this.cashValue=cashValue;
	}
	
	RewardValue(int milesValue){
		this.cashValue=convertToCash(milesValue);
	}


	private Double convertToCash(int milesValue) {
		// TODO Auto-generated method stub
		return milesValue*0.0035;
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

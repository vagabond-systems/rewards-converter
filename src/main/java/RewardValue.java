public class RewardValue {
		private double cashValue;
		private int milesValue;
		public RewardValue(double cashValue) {
			this.cashValue = cashValue;
		}
		public RewardValue(int milesValue) {
			this.milesValue = milesValue;
		}
		public Double getCashValue() {
			return milesValue * 0.0035;
		}
		public Double getMilesValue() {
			return cashValue / 0.0035;
		}	
}
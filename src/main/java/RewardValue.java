public class RewardValue {
  public double cash;
  public double miles;

  public RewardValue(double cash) {
    this.cash = cash;
  }

  public RewardValue(double cash, double miles){
    this.cash = cash;
    this.miles = miles;
  }

  public double getCashValue(){
    cash = miles * .0035;
    return cash;
  }

  public String getMilesValue() {
    miles = cash / .0035;
    String milesStr = "" + miles;
    return milesStr;
  }
}

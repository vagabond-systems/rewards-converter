public class RewardValue {
  public double cash;

  public RewardValue(double cash) {
    this.cash = cash;
  }

  public RewardValue(int miles){
    this.cash = convertToCash(miles);
  }

  public double getCashValue(){
    return cash;
  }

  public int getMilesValue() {
    return convertToMiles(cash);
  }

  private static double convertToCash(int miles){
    return miles * .035;
  }

  private static int convertToMiles(double cash){
    return (int) (cash / .035);
  }
}

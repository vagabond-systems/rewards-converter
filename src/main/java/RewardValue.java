import java.util.Scanner;
public class RewardValue {
  private double cashValue;
  private int miles;

  public RewardValue(double cashValue){
    this.cashValue = cashValue;
  }

  public RewardValue(int miles){
    this.miles = miles;
    this.cashValue = miles / 0.0035;
  }

  public double getCashValue(){
    return cashValue;
  }

  public int getMilesValue(){
    miles = (int)(cashValue * 0.0035);
    return miles;
  }
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Welcome to the Credit Card Rewards Converter!");
    System.out.println("Please enter a cash value to convert to airline miles: ");
    var input_value = scanner.nextLine();
    double cashValue;
    try {
        cashValue = Double.parseDouble(input_value);
    } catch (NumberFormatException exception) {
        System.out.println("Could not parse input value as a double, exiting");
        return;
    }
    System.out.println("miles" + 0.0035 + " to cash");
    var rewardsValue = new RewardValue(cashValue);
    System.out.println("$" + 0.0035 + " is worth " + rewardsValue.getMilesValue() + " miles");



  }
}

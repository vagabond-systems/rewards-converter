import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //UPDATED THE PROMPT BY GIVING OPTIONS
        System.out.println("Welcome to the Credit Card Rewards Converter!\nPlease select your options:\n[1: Cash Value to Mileage] | [2: Mileage to Cash Value] | [Other inputs: Exit]");
        int options = scanner.nextInt();
        scanner.nextLine();
        RewardValue rewardValue;
        
        //CREATE A LOOP FOR MULTIPLE CONVERTERS
        while(options == 1 || options == 2) {
            //SWITCH CASE FOR OPTIONS
            switch(options) {
                case 1:
                    System.out.println("\nPlease enter a cash value to convert to airline miles: ");
                    var cash_input = scanner.nextLine();
                    double cashValue = 0.0;

                    try {
                        cashValue = Double.parseDouble(cash_input);
                    } catch (NumberFormatException exception) {
                        System.out.println("Not the right value. Goodbye");
                        return;
                    }
                    
                    rewardValue = new RewardValue(cashValue);
                    //UPDATED USING STRING FORMAT
                    System.out.printf("$%.2f is worth %d miles", cashValue, rewardValue.getMilesValue());

                    //REPEAT OPTIONS
                    System.out.println("\n\nPlease select your options:\n[1: Mileage to Cash Value] | [2: Cash Value to Mileage] | [Other inputs: Exit]");
                    options = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("\nPlease enter airline miles to convert to a cash value: ");
                    var miles_input = scanner.nextLine();
                    int milesValue = 0;

                    try {
                        milesValue = Integer.parseInt(miles_input);
                    } catch (NumberFormatException exception) {
                        System.out.println("Not the right value. Goodbye");
                        return;
                    }

                    rewardValue = new RewardValue(milesValue);
                    //UPDATED USING STRING FORMAT
                    System.out.printf("%d miles is worth $%.2f", milesValue, rewardValue.getCashValue());

                    //REPEAT OPTIONS
                    System.out.println("\n\nPlease select your options:\n[1: Mileage to Cash Value] | [2: Cash Value to Mileage] | [Other inputs: Exit]");
                    options = scanner.nextInt();
                    scanner.nextLine();
                    break;
                default:
                    break;
                }
            }
            //IF OPTIONS ARE OTHER THAN 1 OR 2
            System.out.println("Goodbye");
    }
}
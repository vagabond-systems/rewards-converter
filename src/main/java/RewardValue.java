public class RewardValue {

    public double cash;
    public static double miles_to_cash = 0.0035;

    RewardValue(double cash){

        this.cash = cash;
    }

    public RewardValue(int miles){


          this.cash = convertToCash(miles);
    }

    private static double convertToCash(int miles){

        return miles * miles_to_cash;
    }

    private static int convertToMiles(double cash){

        return (int) (cash / miles_to_cash);
    }



    public double getCashValue(){

        return cash;
    }

    public int getMilesValue(){

        return convertToMiles(this.cash);
    }
}

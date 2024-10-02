

public class RewardValue{
    static final double mToc = 0.0035; //miles to cash conversion rate
    static final double cTom = 1/mToc; //cash to miles conversion rate
    static int miles;
    static double cash;

    public RewardValue(double cashVal){
        cash = cashVal;
        //miles = (int)(cashVal * cTom);
    }

    public RewardValue(int mileage){
        miles = mileage;
        //cash = mileage * mToc;
    }

    public static double getCashValue(){
        return cash;
    }

    public static int getMilesValue(){
        return miles;
    }

    public static int convertToMiles(){
        return  (int)(cash*cTom);
    }

    public static double convertToCash(){
        return (miles*mToc);
    }
}


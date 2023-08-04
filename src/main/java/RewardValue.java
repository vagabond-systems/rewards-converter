public class RewardValue {

    private final double cashValue;
    int RewardsCash;
    int RewardsMiles;

    public RewardValue(double cashValue, int cash, int miles) {
        this.cashValue = cashValue;
        RewardsMiles = miles;
        RewardsCash = (int) (.0035 * RewardsMiles);
    }

    public RewardValue(double cashValue) {

        this.cashValue = 0;
    }

    public static void main(String[] args){


    }

    public int getCashValue(){
    return RewardsCash;
    }

    public int getMilesValue(){
    return RewardsMiles;
    }
}

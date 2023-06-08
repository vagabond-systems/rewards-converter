public class RewardValue {
    private static final double converstion = 0.0035;
    public double cashValue; 

    public RewardValue(double cash) {
        cashValue = cash;
    }

    public RewardValue(int miles){
        cashValue = Convertingcash2miles(miles);
    }

    public double Convertingcash2miles(int miles){
        return miles * converstion;
    }
    
    public double getCashValue(){
        return cashValue;
    }
    
    public int getMilesValue(){
        return (int) (cashValue / converstion);
    }
}

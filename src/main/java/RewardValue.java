public class RewardValue {
    double cash;
    int miles;

    RewardValue(double cash){

    this.cash= cash;
    }
    RewardValue(int miles){

        this.cash=cvttocash(miles);


    }


    public  double getCashValue(){
        return this.cash;


    }

    public int getMilesValue(){
        
       // double finalmiles= (this.cash/0.0035);
        return (int) cvttomiles(this.cash);
    }
    

    public static int cvttomiles( double cash){
        return (int) (cash/0.0035);

    }

    public static double cvttocash(int miles){
        return (miles*0.0035);
    }



}

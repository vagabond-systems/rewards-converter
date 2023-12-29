import java.util.*;

class RewardValue{
    double cash;
    double miles;

    RewardValue(double cash){
        miles=cash/0.0035;
    }

    RewardValue(double miles,boolean ismile){
        if(ismile)
            cash=miles*0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return miles;
    }

}
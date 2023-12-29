import java.util.*;

class RewardValue{
    double cash;
    double miles;

    RewardValue(double cash){
        this.cash=cash;
        miles=cash/0.0035;
    }

    RewardValue(double miles,boolean ismile){
        this.miles=miles;
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
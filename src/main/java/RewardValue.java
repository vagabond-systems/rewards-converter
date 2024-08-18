public class RewardValue {
     double cashValue;
     double milesValue;

    RewardValue(double cashValue){
        this.cashValue =cashValue;
        milesValue = cashValue / 0.0035;


    }

    RewardValue(int milesValue){
        this.milesValue= milesValue;
        cashValue = milesValue * 0.0035 ;
    }



    double getMilesValue(){
        return milesValue;
    }
    double getCashValue(){
        return cashValue;
    }


}



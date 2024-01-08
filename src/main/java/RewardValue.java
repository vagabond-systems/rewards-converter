public class RewardValue {
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.miles = (int)(cashValue/0.0035);
    }

    RewardValue(int miles){
        this.miles = miles;
        this.cashValue = (double)miles*0.0035;
    }

    double getCashValue(){
        return this.cashValue;
    }

    int getMilesValue(){
        return this.miles;
    }
    double cashValue;
    int miles;
}

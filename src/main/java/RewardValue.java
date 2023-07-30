
    public class RewardValue {

         double cash;

        public RewardValue(int miles){
            this.cash=miles*0.0035;
        }
        public RewardValue(double cash){
            this.cash=cash;
        }
        public double getCashValue(){

            return cash;
        }
        public int getMilesValue(){
            double ans=cash/0.0035;
            return (int)ans;
        }
    }


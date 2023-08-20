public class RewardValue {
        double cash;int miles;
        public RewardValue(double cashValue){
            cash=cashValue;
        }
        public RewardValue(int milesValue){miles=milesValue;}

        public double getCashValue()
        {
         return miles/0.0035;
        }
        public double getMilesValue()
        {
          return cash*0.0035;
        }


}

public class RewardValue {
        double cash;
        public RewardValue(double cashValue){
            cash=cashValue;
        }
        public double getCashValue()
        {
         return cash;
        }
        public double getMilesValue()
        {
          return getCashValue()*0.0035;
        }


}

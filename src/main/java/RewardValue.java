public class RewardValue
{
   private double c;
   private long m;
   public RewardValue(double cValue)
   {
       c=cValue;
       m=(long)(c/0.0035);
   }
   public RewardValue(long mValue)
   {
       m=mValue;
       c=m*0.0035;
   }
   public long getMilesValue()
   {
       return m;
   }
   public double getCashValue()
   {
       return c;
   }
}
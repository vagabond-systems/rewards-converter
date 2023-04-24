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
   public long convertToMiles(double cValue)
   {
       m=(long)(cValue/0.0035);
       return m;
   }

   public double convertToCash(long mValue)
   {
       c=mValue*0.0035;
       return c;
   }
   public long getMilesValue()
   {
       return convertToMiles(this.c);
   }
   public double getCashValue()
   {
       return convertToCash(this.m);
   }
}
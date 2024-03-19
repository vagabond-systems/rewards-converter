

public class RewardValue()
{
	private double _CashValue;
	private int _MilesValue;
	private final double Miles_TO_Cash_Rate = 0.0035;


	public RewardValue(double CashValue)
	{
		this._CashValue = CashValue;
	}
	public RewardValue(int MilesValue)
	{
		this._MilesValue =MilesValue;
	}
	public double getCashValue()
	{
		return convertCashValue();
	}
	public int getMilesValue()
	{
		return convertMilesValue();
	}
	public double convertCashValue()
	{
		return (_MilesValue * Miles_TO_Cash_Rate);
	}
	public int convertMilesValue()
	{
		return (int) (_CashValue / Miles_TO_Cash_Rate) ;
	}
}
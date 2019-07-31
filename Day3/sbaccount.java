/*Arnav Patra*/
public class sbaccount extends account{
	public boolean withdraw(float withdraw_amt)
	{
		if(accountbal - withdraw_amt>=500)
		{
			accountbal=accountbal-withdraw_amt;
			return true;
		}
		return false;
	}
	public void deposit(float depositamt)
	{
		accountbal=accountbal+depositamt;
	}
}

/*Arnav Patra*/
public class account1 {
	int account_no;
	float accountbal;
	float int_rate;
	public account1(int account_no)
	{
		this.account_no=account_no;
	}
	public account1(int account_no,float accountbal,float int_rate)
	{
		this.account_no=account_no;
		this.accountbal=accountbal;
		this.int_rate=int_rate;
	}
	
	public String get_account_det()
	{
		String str="Account number :"+account_no+"\n"+"Account balance: "+accountbal+"\n"+"Interest rate: "+int_rate;
		return str;
	}
	public float caluclateInterest(float amt)
	{
		return amt*int_rate/100;
	}
}

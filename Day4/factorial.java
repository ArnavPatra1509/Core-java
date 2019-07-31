/*Arnav Patra*/
public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fact(5));
	}
	public static int fact(int x)
	{
		if(x==1){
			return 1;
		}
		else{
			return fact(x-1)*x;
		}
	}
}

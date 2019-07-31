/*Arnav Patra*/
public class fibo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0;
		int f2=1;
		System.out.print(f2+" ");
		for(int i=0;i<=5;i++)
		{
			f1=f1+f2;
			f2=f1+f2;
			System.out.print(f1+" "+f2+" ");
		}
	}

}

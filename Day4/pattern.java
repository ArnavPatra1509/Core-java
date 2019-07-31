/*Arnav Patra*/
public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-k;j++)
			{
				System.out.print(" ");
			}
			for(int a=k;a>0;a--)
			{
				System.out.print(k);
			}
			k--;
			System.out.println();
		}
	}

}

/*Arnav Patra
WAP to print diamon pattern*/

public class q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9,k=0,m=3;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<m-k;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=k;j++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
			n=n-2;
			k++;
		}
		int x=5,y=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<y;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=m-y;j++)
			{
				System.out.print(x+" ");
			}
			System.out.println();
			x=x+2;
			y++;
		}
	}

}

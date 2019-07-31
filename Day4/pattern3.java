/*Arnav Patra*/
public class pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=4,x=1;
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>=x;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-b;k++)
			{
				System.out.print(5-b+" ");
			}
			System.out.println();
			b--;
			x++;
		}
		
		int c=4,y=1;	
		for(int i=0;i<4;i++)
		{ 
			
			for(int j=0;j<=y;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=4-c+1;k--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
			y++;
			c--;
		}
	}

}

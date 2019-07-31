/*Arnav Patra
Wap to implement while loop*/
import java.util.Scanner;
public class Q14_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int z=x;
		double sum=0;
		String s=Integer.toString(x);
		while(x>0)
		{
			int y=x%10;
			x=x/10;
			sum=sum+Math.pow(y,s.length());
		}
		if(z==sum)
		{
			System.out.println("Armstrong NUmber");
		}
		else
		{
			System.out.println("Not armstrong number");
		}
	}

}

/*Arnav Patra
WAP to nested if */

import java.util.Scanner;
public class Q13_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int x=sc.nextInt();
		System.out.println("Enter the second number");
		int y=sc.nextInt();
		System.out.println("Enter the third number");
		int z=sc.nextInt();
		if(x>y && x>z)
		{
			System.out.println(x+" is largest");
			if(y>z)
			{
				System.out.println(z+" is smallest");
			}
			else
			{
				System.out.println(y+" is smallest");
			}
		}
		else if(y>x && y>z)
		{
			System.out.println(y+" is largest");
			if(z>x)
			{
				System.out.println(x+" is smallest");
			}
			else
			{
				System.out.println(z+" is smallest");
			}
		}
		else
		{
			System.out.println(z+" is largest");
			if(y>x)
			{
				System.out.println(x+" is smallest");
			}
			else
			{
				System.out.println(y+" is smallest");
			}
		}
		
	}

}

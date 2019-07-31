/*Arnav Patra
Wap to implement for loops and if condition*/

import java.util.Scanner;
public class Q10_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float max_avg1=0.0f;
		String a="";
		for(int i=1;i<=3;i++)
		{
			float avg=0.0f;
			System.out.println("Name of the student");
			String s=sc.next();
			System.out.println(s+" Student data");
			for(int j=1;j<=4;j++)
			{
				int x=0;
				System.out.println(i+" Student's "+j+" subject mark");
				x=sc.nextInt();
				avg=avg+x;
				
				
			}
			avg=avg/4;
			if(avg>max_avg1)
			{
				max_avg1=avg;
				a=s;
			}
			System.out.println(i+" Student avg is "+avg);
					}
		System.out.println("Highest avg is "+max_avg1+" Student name is "+a);
	
		}
	}

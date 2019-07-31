/*Arnav Patra
WAP to find al the number which are divisible by 3 in between 0-30*/

public class Q15_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int sum=0;
		while(x<=30)
		{
			if(x%3==0)
			{
				System.out.println(x+" is divisible by 3");
				sum=sum+x;
			}
			x++;
		}
		System.out.println("Sum is "+sum);
	}

}

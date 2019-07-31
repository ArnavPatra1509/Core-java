/*Arnav Patra*/
public class prime_sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,count=0,sum=0;
		System.out.println("Prime Number");
		while(count!=10)
		{
			int count1=0;
			for(int j=1;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					count1++;
				}
			}
			if(count1==1)
			{
				System.out.println(i);
				sum=sum+i;
				count++;
				
			}
			i++;
		}
		System.out.println("Sum"+sum);

	}

}

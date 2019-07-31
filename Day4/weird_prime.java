/*Arnav Patra*/
public class weird_prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,count=0,sum=0,count2=0,x,y,count3=0;
		System.out.println("Prime Number Sequence");
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
				
				if(count2%4==2||count2%4==3)
				{
					sum=sum+i;
					count3++;
					if(count3==2)
					{
						System.out.print(sum+" ");
						sum=0;
						count3=0;
					}
				}
				else
				{
					System.out.print(i+" ");
				}
				count++;
				count2++;
				
				
			}
			i++;
		}

	}

}

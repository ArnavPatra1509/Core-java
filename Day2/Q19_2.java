/*Arnav Patra
WAP to find the avg of numbers in array*/
public class Q19_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0 , avg;
		int[] m={91,92,86,89,94};
		for(int i=0;i<=4;i++)
		{
			sum=sum+m[i];
		}
		avg=sum/5;
		for(int i=0;i<=4;i++)
		{
			if(m[i]>=avg)
			{
				System.out.println(m[i]);
			}
		}
	}

}

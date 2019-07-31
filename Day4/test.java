/*Arnav Patra*/

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			int rem=i%2;
			if(rem==0)
			{
				System.out.println(i);
				i++;
				continue;
			}
			if(rem!=0)
			{
				i=i+2;
				System.out.println(i);
				break;
			}
				
		}
	}

}

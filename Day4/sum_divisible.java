/*Arnav Patra*/
public class sum_divisible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=200;i++){
			if(i%7==0 && i%11==0)
			{
				sum=sum+i;
			}
		}
		System.out.print("Sum is:"+sum);
	}

}

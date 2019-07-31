/*Arnav Patra
WAP to find the pair of number in array whose sum is 33*/
public class Q20_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[]={23,14,37,29,7,0,38,29,21,12,33};
		for(int i=0;i<m.length;i++)
		{
			for(int j=1;j<m.length;j++)
			{
				if(m[i]+m[j]==33)
				{
					System.out.println(m[i]+" + "+m[j]+" = "+(m[i]+m[j]));
				}
			}
		}
	}

}

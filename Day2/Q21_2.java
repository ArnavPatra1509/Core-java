/*Arnav Patra
Method*/
public class Q21_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		int x=10 , y=15;
		add(x,y);
		int z=sub(x,y);
	}
	public static void add(int x , int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	public static int sub(int x, int y )
	{
		return x-y;
	}
	

}

/*Arnav Patra*/
package Training2;

public class exceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c;
		int d[]={1,2,3,4};
		try{
//			c=a/b;
//			System.out.println(c);
			System.out.println(d[3]);
			System.out.println(d[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);			
		}
		System.out.println("Outside the block");
	}

}

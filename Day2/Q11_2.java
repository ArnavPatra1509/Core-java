/*Arnav Patra
Wap to implement if-else*/
import java.util.Scanner;
public class Q11_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println(x+" is even");
		}
		else{
			System.out.println(x+" is odd");
		}
	}

}

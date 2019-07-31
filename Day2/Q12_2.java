/*Arnav Patra
Wap to check whether the input character is vowels or not*/
import java.util.Scanner;
public class Q12_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Its a vowel");
		}
		else
		{
			System.out.println("Its a constant");
		}
	}

}

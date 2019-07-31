/*Arnav Patra*/
import java.util.Scanner;
public class Q25_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		student s1=new student();
		student s2=new student();
		float avg1,avg2;
		System.out.println("Mark of first subject");
		s1.mark1=sc.nextFloat();
		System.out.println("Mark of second subject");
		s1.mark2=sc.nextFloat();
		System.out.println("Name of the student");
		s1.Name=sc.next();
		System.out.println("Mark of first subject");
		s2.mark1=sc.nextFloat();
		System.out.println("Mark of second subject");
		s2.mark2=sc.nextFloat();
		System.out.println("Name of the student");
		s2.Name=sc.next();
		avg1=s1.avg();
		avg2=s2.avg();
		//System.out.println(avg1+" "+avg2);
		if(avg1>avg2)
		{
			s1.nam();
			System.out.println("Higher avg is:"+avg1);
		}
		else
		{
			s2.nam();
			System.out.println("Higher avg is:"+avg2);
		}
	}

}

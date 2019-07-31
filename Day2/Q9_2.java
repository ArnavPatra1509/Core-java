/*Arnav Patra
Wap to implement if */
public class Q9_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit=300;
		int x;
		double sum=0;
		if(unit>=250)
		{
			x=unit-250;
			sum=sum+(x*4.0);
			unit=unit-x;
		}
		if(unit>=200)
		{
			x=unit-200;
			sum=sum+(x*2.5);
			unit=unit-x;
		}
		if(unit>=100)
		{
			x=unit-100;
			sum=sum+(x*2);
			unit=unit-x;
		}
		if(unit>=00)
		{
			x=unit-0;
			sum=sum+(x*1.5);
			unit=unit-x;
		}
		System.out.println(sum);
	}

}
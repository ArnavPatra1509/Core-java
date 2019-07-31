/*Arnav Patra*/
package Training2;

public class testemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consultant cs=new consultant(190, 1234, "Arnav" , 700);
		int x=cs.calc_monthly_salary();
		System.out.println("Salary "+x);
		FTE f=new FTE(190, "Arnav" ,1234 , 700);
		int f1=f.calc_monthly_salary();
		System.out.println("Salary "+f1);
	}

}


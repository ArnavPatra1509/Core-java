/*Arnav Patra*/
package Training2;

public class consultant extends employee {

	int hour_worked;
	public int calc_monthly_salary()
	{
		int sal;
		sal=hour_worked*rate_per_unit;
		return sal;
	}
	consultant(int hour_worked,int eid,String e_name,int rate_per_unit)
	{
		super(eid, e_name, rate_per_unit);
		this.hour_worked=hour_worked;
	}
}

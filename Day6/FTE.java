/*Arnav Patra*/
package Training2;

public class FTE extends employee {
	
	int day_worked;
	
	public FTE(int eid, String e_name, int rate_per_unit, int day_worked) {
		super(eid, e_name, rate_per_unit);
		this.day_worked = day_worked;
	}

	public int calc_monthly_salary()
	{
		return day_worked*rate_per_unit;
	}
}

/*Arnav Patra*/
package Training2;

public abstract class employee {
	int eid;
	String e_name;
	int rate_per_unit;
	
	public abstract int calc_monthly_salary();
	

	public employee(int eid, String e_name, int rate_per_unit) {
		super();
		this.eid = eid;
		this.e_name = e_name;
		this.rate_per_unit = rate_per_unit;
	}


	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public int getRate_per_unit() {
		return rate_per_unit;
	}

	public void setRate_per_unit(int rate_per_unit) {
		this.rate_per_unit = rate_per_unit;
	}
	
	
}

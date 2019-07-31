/*Arnav Patra*/
public class test_bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b =new citi();
		System.out.println("Citi bank: "+b.roi());
		b =new icici();
		System.out.println("ICICI bank "+b.roi());
	}

}

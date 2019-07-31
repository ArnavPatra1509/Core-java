/*Arnav Patra*/
public class Q24_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile smg=new mobile();
		smg.color="Black";
		smg.len=3;
		smg.breadth=2;
		smg.brand="Samsung";
		smg.call();
		smg.message();
		smg.details();
	}

}
class mobile
{
	String color;
	float len;
	float breadth;
	String brand;
	public void call()
	{
		System.out.println("Calling");
	}
	public void message()
	{
		System.out.println("Messaging");
	}
	public void details()
	{
		System.out.println("Color: "+color+" Length: "+len+" Breadth: "+breadth+" Brand: "+brand);
	}
}

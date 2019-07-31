/*Arnav Patra*/

public class str1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am learning Core Java",s2="Hello",s1="hello";
		int l=s.length();
		System.out.println("Length "+l);

		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s.substring(0,4));
		
		System.out.println("position "+s.indexOf('a'));
		
		System.out.println("position "+s.indexOf('a',3));
		
		System.out.println("position "+s.indexOf('z',3));
	}

}

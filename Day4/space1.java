/*Arnav Patra*/
public class space1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am learning core java";
		int x=0;
		int p=0,i=0;
		while(s.indexOf(' ',i)!=-1)
		{
				p=s.indexOf(' ',i);
				System.out.println(s.substring(i,p));
				i=p+1;
			
			
			
			
		}
		System.out.println(s.substring(i,s.length()));
	}

}

/*Arnav Patra*/
public class space {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am learning core java ";
		int x=0;
		int p=0,i=0;
		while(p!=-1)
		{
			if(s.indexOf(' ',i)!=-1)
			{
				p=s.indexOf(' ',i);
				System.out.println(s.substring(i,p));
				i=p+1;
			}
			else
			{
				break;
			}
			
		}
	}
	
}

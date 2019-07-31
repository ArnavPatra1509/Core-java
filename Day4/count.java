/*Arnav Patra*/
public class count {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am learning Core java";
		int count=0;
		/*for(int i=0;i<=s.length();i++)
		{
			i=s.indexOf('a',i);
			System.out.println("The index of a is "+i);
			i++;
			count++;
		}*/
		int p=0,i=0;
		while(p!=-1)
		{
			p=s.indexOf('a',i);
			i=p+1;
			count++;
		}
		System.out.println(--count);
	}

}

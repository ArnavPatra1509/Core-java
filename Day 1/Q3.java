/*Arnav Patra
Wap to count the number od words in the string*/

public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="I am learning ore java";
		System.out.println(line);
		int count=0;
		for(int i=0;i<line.length();i++)
		{
			char c=line.charAt(i);
			if(c==' ')
			{
				count++;
			}
			
		}
		count=count+1;
		System.out.println("Number of words "+count);
	}

}

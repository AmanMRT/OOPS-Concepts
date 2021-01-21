package inheritance;

public class wipro
{
	public static void main(String[] args) 
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if(str1 == str2)
		{
			System.out.println(1);
		}
		
		if(str1.equals(str2))
		{
			System.out.println(2);
		}
		
		if(str1.contains(str2))
		{
			System.out.println(3);
		}
	}

}

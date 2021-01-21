package polymorphism;
// Example for constructor overloading 
public class constructor_Overloading 
{
	public constructor_Overloading()
	{
		System.out.println("First");
	}
	
	public constructor_Overloading(int num)
	{
		System.out.println("Second");
	}
	
	public constructor_Overloading(String str)
	{
		System.out.println("Third");
	}
	
	public constructor_Overloading(int num, String str)
	{
		System.out.println("Fourth");
	}
	public static void main(String[] args) 
	{
		constructor_Overloading co = new constructor_Overloading();
		constructor_Overloading c1 = new constructor_Overloading(0);
		constructor_Overloading c2 = new constructor_Overloading(null);
		constructor_Overloading c3 = new constructor_Overloading(0,null);
	}
}

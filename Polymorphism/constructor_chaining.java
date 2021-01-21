package polymorphism;

//Example of constructor chaining using this keyword
public class constructor_chaining 
{
	public constructor_chaining()
	{	this(0);
		System.out.println("First");
	}
	
	public constructor_chaining(int num)
	{	this(null);
		System.out.println("Second");
	}
	
	public constructor_chaining(String str)
	{	this(0, null);
		System.out.println("Third");
	}
	
	public constructor_chaining(int num, String str)
	{	
		System.out.println("Fourth");
	}
	public static void main(String[] args) 
	{
		constructor_chaining co = new constructor_chaining();
	
	}
}

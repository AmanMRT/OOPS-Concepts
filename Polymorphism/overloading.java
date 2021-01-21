package polymorphism;

//example of method overloading
class Test
{
	void show()
	{
		System.out.println("First");
	}
	
	void show(int num)
	{
		System.out.println("Second");
	}
	
	void show(String str)
	{
		System.out.println("Third");
	}
	
	void show(int num, String str)
	{
		System.out.println("Fourth");
	}
}

public class overloading 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();
		t.show(0);
		t.show(null);
		t.show(0, null);
	}

}

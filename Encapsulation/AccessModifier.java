package Encapsulation;

class Modifier
{
	public String name;
	private double salary;
	protected int age;
	String address;
}
public class AccessModifier
{
	public static void main(String[] args)
	{
		Modifier m = new Modifier();
		m.name = "A";
		//m.salary = 10.0;		/* not acesseible  */
		m.age = 10;
		m.address = "ABC";
	}
}

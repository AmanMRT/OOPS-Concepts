package inheritance;

import java.util.ArrayList;

class Parent
{
	//unparamterized comstructor
	public Parent()
	{
		System.out.println("Constructor of parent class");
	}
	
	//parameterized constructor
	public Parent(int age)
	{
		System.out.println("Constructor of parent class " + age );
	}
	
	void show()
	{
		System.out.println("Show function parent class");
	}
	void display()
	{
		System.out.println("Display function parent class");

	}
}

class Child extends Parent
{
	public Child()
	{
		//super(10);	/* will inwoke parameterized constructor of parent class */
		System.out.println("Constructor of child class");
	}
	//method overridding 
	void show()
	{
		//super.display(); //will invoke dispaly of parent class
		//this.display(); //will invoke display of child class
		System.out.println("Show function child class");
	}
		
	void display1()
	{	
		System.out.println("Display function child class");
	} 
}
public class inheritance
{
	public static void main( String[] args) 
    {
		//Child c = new Child();		/* Output function of CHILD class */
		//Parent p = new Parent();	/* Output function of Parent class */
		Parent pc = new Child();	/* Output function of CHILD class */
		//Child cp = (Child) new Parent(); /* inheritance.Parent cannot be cast to inheritance.Child */
		pc.show();
		//pc.display();
	  //pc.display1();		/* cant acess methods of child class through refrence of Parent class  */
    }
}

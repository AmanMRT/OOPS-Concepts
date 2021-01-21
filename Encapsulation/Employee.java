package Encapsulation;

//Use of POJO (Plain Old Java Object) class
public class Employee 
{
	private String name;
	private int age;
	private double salary;
	private String address;
	
	//unparameterised constructor is compulsory to make
	public Employee() {
		
	}
	
	//parameterised constructor to add values
	public Employee(String name, int age, double salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals(null))
		{
			throw new IllegalArgumentException("name cannot be null");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 18 || age > 58)
		{
			throw new IllegalArgumentException("Age must belong to 18 to 58 only");
		}
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address.equals(null))
		{
			throw new IllegalArgumentException("Address cannot be null");
		}
		this.address = address;
	}

	// if not done will result in returning hashcode of the object
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
}

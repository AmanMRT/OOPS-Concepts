package Encapsulation;

/* Encapsulation can be done by
 * 1) use of access modifiers
 * 2) use of POJO class
 * 3) using { } brackets
 */

public class employeeSet 
{
	public static void main(String[] args)
	{	
		Employee emp = new Employee();
		
		emp.setName("Aman");
		emp.setAge(22);
		emp.setSalary(40000);
		emp.setAddress("Meerut");
		
		//to print object details
		System.out.println(emp);
		
		Employee emp1 = new Employee();
		
		emp1.setName("Aman1");
		emp1.setAge(221);
		emp1.setSalary(400001);
		emp1.setAddress("Meerut1");
		
		//to print object details
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		
		emp2.setName("Aman2");
		emp2.setAge(22);
		emp2.setSalary(400002);
		emp2.setAddress("Meerut2");
		
		//to print object details
		System.out.println(emp2);
		
		//store them in one object like here array and print with enhanced for loop
		Employee[] empArray = new Employee[3];
		empArray[0] = emp;
		empArray[1] = emp1;
		empArray[2] = emp2;
		
		for(Employee e : empArray)
		{
			System.out.println(e.getName() + " " + e.getAge() + " " + e.getSalary() + " " + e.getAddress()); 
		}
	}

}


package Employee;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		System.out.println("PNT Employee Details:");
		System.out.println();
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Gilbert Biswas", 75000, 1987, 12, 15);
		staff[1] = new Employee("Alex Karmokar", 50000, 1989, 10, 1);
		staff[2] = new Employee("Shafiqul Khan", 40000, 1990, 3, 15);
	
		//Raise Everyone's salary by 5%
		for (Employee e : staff)
			e.raiseSalary(5);
		
		//Print out information about all Employee objects
		for (Employee e:staff)
			System.out.println("Name = " + e.getName()+ ", Salary = $" + e.getSalary() + ", Hire Day = " + e.getHireDay());
	
	}

}



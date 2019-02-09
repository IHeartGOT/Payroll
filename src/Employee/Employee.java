package Employee;

import java.util.Date;
import java.util.GregorianCalendar;


public class Employee 

{ 
	public Employee(String n, float s, int year, int month, int day)
	
	{
		Name = n;
		Salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
		HireDay = calendar.getTime();
	}
	
	public String getName()
	
	{
		
	return Name;
	
	}
	
	public float getSalary()
	
	{
		
		return Salary;
		
	}
	
	public Date getHireDay()
	
	{
		
		return HireDay;
	}
	
	public void raiseSalary(double byPercent)
	
	{
		double raise = Salary * byPercent / 100;
		
		Salary+=raise;
	}
	
	private String Name;
	private float Salary;
	private Date HireDay;
}

package seleniumdemo;
abstract class Employee 
{
	String name;
	int age;
	public double salary;
	
	public static void main(String[] args)
	{
		System.out.println("Hi");
	}
	public double empsalary()
	{
		return salary;
	}
	
	public String empname()
	{
		return name;
	}

	protected abstract double empbonus();
	
}
class Employeebonus extends Employee
{
	public double empbonus()
		{
			double bonus=10.56;
			salary=bonus*salary;
			return salary;
		}
}
	

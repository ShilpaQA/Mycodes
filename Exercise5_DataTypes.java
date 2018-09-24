
public class Exercise5_DataTypes {
	
	public static final double pi=3.14;// constant declaration 
	
	public static void main(String[] args)
	{
		System.out.println("There are 2 types pf data types");
		System.out.println("1.Primitive : System defined datatypes like int,float,double");
		System.out.println("2.Object : User defined datatypes ");
		demoPrimitive();
		mixDatatype();
	}
	
	//typically numbers 
	public static void demoPrimitive() 
	{	int i;
		i=10;
		int inc =i++;//i=10+1
		System.out.println(i);
		int inc1 =++i;//12
		i=(int)pi+1;
		System.out.println("The value: "+ inc +inc1);
		
	}
	
	public static void mixDatatype()
	{
		int i;
		int x =-10;
		double y=24.87459;
		
		i=x+(int)y; 
		
		String s="Hello";
		s=i+s;
		System.out.println(s);
		
		
		
	}
}

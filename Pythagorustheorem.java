package Outsideworldexcercise;

//Pythagoreus theorem  : c2 = a2 +b2 
public class Pythagorustheorem {
	
	public static void main(String[] args)
	{
		//double c =0;
		theorem(10,12);
		//System.out.println(c);
		
	}
	
	 
	public static double theorem (double a, double b)
	{
		double c =Math.sqrt((a*a)+(b*b));
		System.out.println(c);
		return c;
		
	}

}

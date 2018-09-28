
public class Execercise9_Methoddeclaration {
	
	public static void main (String[] args)
	{
		int x=5;
		change(x);
		System.out.println(x);
		
	}
		
	public static void cake(int sugar, int eggs, int flour)
	{
		
		System.out.println("Add " +sugar+ " cups of sugar first");
		System.out.println("Add " +eggs+ " eggs");
		System.out.println("Add " +flour+ " cups of flour");
		System.out.println("Blend");
		
	}
	
	public static int change (int x)
	{
		x*=10;
		return x;
	}
}

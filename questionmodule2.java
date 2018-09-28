
public class questionmodule2 {
	
	public static void main(String[] args)
	{
	int x = 64;
	int y = 0;
	while (x % 2 == 0) {
	    y++;
	    System.out.println("x1 " +x);
	    x = x / 2;
	    System.out.println("x2 " +x);
	}
	System.out.println(x + " " + y);
	}
}
import java.util.Scanner;

public class timediffcalc {
	
	
	public static void main(String[] args)
	{
		timedifference();
	}
	
	public static void timedifference()
	{
		
		System.out.println("What is the time difference, in hours, between your home and your destination?");
		System.out.println("Note1: If it is \"behind\" Please enter negative number");
		System.out.print("Note2: Enter time in 24hour format");
		Scanner input = new Scanner(System.in);
		int time=input.nextInt();
		int midnight=24;
		int calctime=(midnight+time)%24;
		System.out.println("That means when it is midnight at home it will be "+calctime+ ":00 at your travel destination");//
		int noon=12;
		int calctimenoon=12+time;		
		calctimenoon=calctimenoon%24;
		System.out.println("and when it is noon at home it will be "+calctimenoon+":00");		
		//System.out.println("and when it is noon at home it will be "+calctimenoon+":00");				
	}
}

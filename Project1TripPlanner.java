import java.util.Scanner;

public class Project1TripPlanner {
	
	public static void main(String[] args)
	{
		greeting();
		endOfMethod();
		travelTimeandBudget();
		endOfMethod();
		timeDifference();
		endOfMethod();
		distance();
		endOfMethod();
		
	}
	
	
	public static void greeting()
	{
		System.out.println("Welcome to Vacation Planner !");
		System.out.print("What is your name?");
		Scanner input = new Scanner(System.in);
		String name= input.nextLine();
		System.out.print("Nice to meet you "+name+", Where are you travelling to? ");
		String destn=input.nextLine();
		System.out.println("Great! "+destn+ " sounds like a great trip");
			
	}

	public static void endOfMethod()
	{
		
		System.out.println("*****************************");
	}
	
	public static void travelTimeandBudget()
	{
		System.out.print("How many days are you planning to spend travelling? ");
		Scanner input = new Scanner(System.in);
		int days=input.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		double usdmoney=input.nextDouble();
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		String curr=input.next();		
		System.out.print("How many "+curr+ " are there in 1 USD?");
		double currency=input.nextDouble();
		//Days to hours 
		double hours=days*24;
		double mins=hours*60;
		System.out.println("If you are travelling for "+days+" days that is same as "+hours+ " hours or " +mins+ " minutes");
		double perday=usdmoney/days;
		System.out.println("If you are going to spend "+usdmoney+" USD that means per days you can spend "+perday+" USD");
		double budget=currency*usdmoney;
		double perday2=budget/days;
		System.out.println("Your total budget in "+curr+" is "+budget+" which per day is "+perday2+" " +curr);
	}
	
	public static void timeDifference()
	{
		
		System.out.println("What is the time difference, in hours, between your home and your destination?");
		System.out.println("Note1: If it is \"behind\" Please enter negative number");
		System.out.print("Note2: Enter time difference in 24hour format. Example if ahead by 13 hours, enter 13");
		Scanner input = new Scanner(System.in);
		int time=input.nextInt();
		int midnight=24;
		int calctime=(midnight+time)%24;
		System.out.println("That means when it is midnight at home it will be "+calctime+ ":00 at your travel destination");//
		int noon=12;
		int calctimenoon=noon+time;		
		calctimenoon=calctimenoon%24;
		System.out.println("and when it is noon at home it will be "+calctimenoon+":00");		
		//System.out.println("and when it is noon at home it will be "+calctimenoon+":00");				
	}
	
	public static void distance()
	{
		System.out.println("What is the square are of your destination country in Kilometers (kms)?");
		//Convert kms to miles
		Scanner input = new Scanner(System.in);
		double kms=input.nextDouble();
		double miles =0.621371*kms;
		System.out.println("In miles that will be:" +miles);
		
	}
	
	
}

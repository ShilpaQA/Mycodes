import java.util.Scanner;

public class Excercise8_Ifelse {
	
	public static void main(String[] args)
	{
		calcgrade();
		
	}
	
	
	public static void calcgrade()
	{
		int grade;
		System.out.print("Please enter your grade");
		Scanner input = new Scanner(System.in);
		grade=input.nextInt();	
		
		if (grade>=40 && grade<=75)
		{
			System.out.println("Lets Hope for best! You are in probation");
			
		}
		else if (grade<40 && grade>0)
		{
			System.out.println("Sorry! Please try again after improving your grades");
		}
		else if (grade<0)
		{
			System.out.println("You need to take a test to evaluate your admission");
		}
		else
		{
			System.out.println("Congrats! You're IN");
		}
		
	}

}

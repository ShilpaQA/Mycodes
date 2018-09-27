import java.util.Random;
import java.util.Scanner;

public class Project2Oddsandevensgame {	
	public static String uchoice;	
	//main method 
	public static void main(String[] args)
	{	
		greetings();
		endofline();
		game();
		endofline();		
	}
	//Greetings and Input method 	
	public static void greetings()
	{
		System.out.println("Let’s play a game called \"Odds and Evens\"");
		System.out.println("What is your name?");
		Scanner input= new Scanner(System.in);
		String name= input.nextLine();
		System.out.println("Hi, "+name+ " Which do you choose? :(O)dds or (E)vens");
		String choice1="Odds";
		String choice2="Evens";
		uchoice=input.next();		
		if(uchoice.equalsIgnoreCase("o")||uchoice.contains(choice1)||uchoice.equalsIgnoreCase("odd"))
		{
			System.out.println("You choose \"Odds\"");
			System.out.println("As your playing against computer,it chooses \"Evens\"");
		}
		else if (uchoice.equalsIgnoreCase("e")||uchoice.contains(choice2)||uchoice.equalsIgnoreCase("even"))
		{ 
			System.out.println("You choose Evens");
			System.out.println("As your playing against computer,it chooses \"Odds\"");
		}
		else
		{
			System.out.println("Please make a valid choice. Lets start over");
			greetings();
		}
	}
		//End of line decor
	public static void endofline()
	{
			for (int i=0;i<=2;i++)
			{
				for(int j=0;j<25;j++)
				{
					System.out.print("-");
				}
	}
	}
	
	//Who won 
	public static void game()
		{
			System.out.print("\nHow many fingers do you put out?");
			Scanner input = new Scanner(System.in);
			int fingers=input.nextInt();
			Random random=new Random();
			int computer = random.nextInt(6);  // computer picks random number
			System.out.println("The computer played " +computer+" fingers");			
			int result=fingers+computer;
			endofline(); //decor 			
			System.out.println( "\nLets see who won ");
			System.out.println("The sum is : " +result); 
			
			if (result%2==0||result==2)
			{
				String finalres="even";
				System.out.println("Result is even");
				
				if (uchoice.equalsIgnoreCase(finalres)||uchoice.contains(finalres)||uchoice.equalsIgnoreCase("e"))
				{
					System.out.println("Wooo hooo !! You won :) ");
				}
				else 
				{
					System.out.println("Sorry !! You lost :( ");
				}
			}
			else
			{ 
				String finalres="odd";
				System.out.println("Result is odd");
				if (uchoice.equalsIgnoreCase(finalres)||uchoice.contains(finalres)||uchoice.equalsIgnoreCase("o"))					
						{
					System.out.println("Wooo hooo !! You won :)");
				}
				else 
				{
					System.out.println("Sorry !! You lost :(");
				}
			
			
		}
		}
		
	
}

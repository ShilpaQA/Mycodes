import java.util.Scanner;

public class AssignmentRockPaperScissors {
	
	public static void main(String[] args)
	{
		game();
	}
	
		
	public static void game()
	{
		System.out.println("Please enter Player 1");
		String player1;
		Scanner input = new Scanner(System.in);
		player1=input.next();
		System.out.println("Please enter Player 2");
		String player2;
		player2=input.next();
		
		//tie 
		if(player1.equalsIgnoreCase(player2))
		{
			System.out.println("This is a tie");
		}
		
		//
		if (player1.equalsIgnoreCase("Rock")||player1.equalsIgnoreCase("Scissors")&& player2.equalsIgnoreCase("Paper") )
		{
			System.out.println("Player 1 wins");
			
		}	else if (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("Rock"))
			{
			System.out.println("Player 2 wins");}
	}
			
}
import java.util.Scanner;

public class Primenumbers {
	
	public static void main(String[] args)
	{
		primecheck();
		
		/*//prime numbers 
		 int count=0;
		for(int i=4;i<=25;i++)
		{
			if(i%2==0||i%3==0)
			{
			 //							
			}
			else
			{  
				System.out.println("Prime: " +i);				
				count++;
			}			
		}
		System.out.println("Count of prime numbers: " +count);*/
	}
	
	
	//check if a number is prime or not 
	
	public static void primecheck()
	{
		
		int number;
		System.out.println("Please input a valid number between 1-10000 to check if it is prime");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		
		if(number==2||number==3)
		{
			System.out.println("Number is prime");
		}
		else
		{
			if(number%2==0||number%3==0)
			{
				System.out.println("Number is not prime");
			}
			else 
			{
				System.out.println("Number is prime");
			}			
		}
	}

}

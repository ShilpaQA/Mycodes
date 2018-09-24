import java.util.Scanner;

public class Exercise7_scnner {
	
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name");
		String name = input.next();
		System.out.println("Hello" +name);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your text");
		String text = input2.nextLine();
		System.out.println("Your text\t"  +text);
		/*
		System.out.println("Enter two numbers");
		Double num1=input.nextDouble();
		Double num2=input.nextDouble();
		System.out.println("Product of two numbers" +num1*num2);*/
	}

}

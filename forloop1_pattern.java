package Outsideworldexcercise;

public class forloop1_pattern {
	
		public static void main(String[] args)
		{
			
			for (int j=7;j>=0;j--)
			{			
				for(int k=1;k>=j;k++)
				{
					System.out.print(k);
				}
				
				for(int i=j;i>=0;i--)
					{		
						
						System.out.print("*");
					}
				System.out.println(" ");				
			}
			
								  
		}
}

import java.sql.Date;
import java.sql.Time;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Execercise6_MathOperations 
{

	public static void main(String[] args)
	{
		
		//inci();
		//incij();
		//math();
		//mod();
		concatex();
		
	}
	
	
	
	/*static void inc()
	{
		int i;
		i=1;
		System.out.println(i); // 1
		i++;
		System.out.println(i);//
		++i; //3
		System.out.println(i);
		--i;//2
		System.out.println(i);
		i--;
		System.out.println(i);
		i++;
		System.out.println(i);//2
		
		
	}*/
	
	/*static void incij()
	{
		int i;
		int j;
		i=10;
		j=i++;
		System.out.println("The value of j" +j);
		System.out.println("The value of i"+i);//j=10 | i=11 
		j=++i;
		System.out.println("The value of j" +j);  //j=12 
		System.out.println("The value of i" +i); // i=12 
		
	}
	
	static void inci()
	{
		int i;	
		i=10;
		i++;	
		System.out.println("The value of i"+i);// i=11
		++i;
		System.out.println("The value of i" +i); // i=12 
		
	}
	
	static void math()
	{
		int i=101;	
		int j=100;
		int z=10; //	x = x + y;
		z+=i;
		z-=j;
		z*=10;
		z/=100;
		System.out.println(i*j);
		System.out.println(i*j+j-i/j);  //PMDAS
		System.out.println(i*(j-j)-(i/j));//101*200-1
		System.out.println(z);
	}
	
	static void mod()
	{
		int i=45;	
		int j=2;
		int z=100; //	x = x + y;
		
		System.out.println("moda "+i%j);// remainder 
		System.out.println("modb " +z%j);//remainder 
		
	}*/
	
	static void concatex()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		//System.out.println(dtf.format(now)); //2016/11/16 12:08:43
		
		//Time apptime;
		//appdate=
		
		String a;
		a="Good ";
		String b;
		b="day";
		a=b;
		System.out.println(a);
		//Instant instant=Instant.now();  // prints UTC timestamp 
		b="day";
		//System.out.println("It is now : " + now + "\nPlease have a " +a+b);
		//System.out.println(date);
		
		//System.out.println(("0"+"3")+2*4*8/2);
		//System.out.println("Hello \"hi\" you");
		//System.out.println("10 plus 20 is "+10+20);
		//System.out.println(1+3/2-7%3);
		//System.out.print("Hello ");
		//System.out.println("World ");
		//System.out.print("JAVA is fun ");
		//System.out.println("Shilpa");
		//System.out.println("Pai");
		////System.out.print("Shilpa");
		//System.out.print("Pai");
		
	}
	
	
	
}

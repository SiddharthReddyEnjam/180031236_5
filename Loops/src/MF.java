import java.util.*;
public class MF 
{
	public static void main(String args[])
	{
		int age;
		char c;
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);
		age = sc.nextInt();
		if(c=='F'&&age>=1&&age<=58)
		{
			System.out.println("Your percentage rate of interest is 8.2%.");
		}
		else if(c=='F'&&age>=59)
		{
			System.out.println("Your percentage rate of interest is 9.2%.");
		}
		else if(c=='M'&&age>=1&&age<=58)
		{
			System.out.println("Your percentage rate of interest is 8.4%.");
		}
		else if(c=='M'&&age>=59)
		{
			System.out.println("Your percentage rate of interest is 10.5%.");
		}
	}
}

import java.util.*;
class Fourteen {
	public static void main(String[] args)
	{
		int n,i,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		n = sc.nextInt();
		if(n==1||n==0) System.out.println(n+" neither prime nor composite");
		else if(n>1)
		{
		for(i=1;i<=n;i++)
		{
			if(n%i==0) count++;
		}
		if(count==2) System.out.println(n+" is a prime number");
		else System.out.println(n+" is not a prime number");
		}
		else
		{
			System.out.println("Enter a valid integer");
		}
	}
}
import java.util.*;
class Eighteen 
{
	public static void main(String args[])
	{
		int n,r,sum=0,temp;    
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp=n;    
		while(n>0)
		{    
			r=n%10;  //getting remainder  
		    sum=(sum*10)+r;    
		    n=n/10;    
		}    
		if(temp==sum) System.out.println(temp+" is a palindrome");    
		else System.out.println(temp+" is not a palindrome");
	}
}

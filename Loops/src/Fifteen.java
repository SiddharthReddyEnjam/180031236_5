import java.util.*;
class Fifteen {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		long n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		int sum=0;
		while(n!=0)
		{
			sum+=n%10;
			n = n/10;
		}
		System.out.println(sum);
	}
}

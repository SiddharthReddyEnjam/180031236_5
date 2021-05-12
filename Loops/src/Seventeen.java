import java.util.*;
class Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		while(n!=0)
		{
			System.out.print(n%10);
			n = n/10;
		}
	}

}

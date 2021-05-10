import java.util.Scanner;

public class One {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n==0) System.out.println("Zero");
		if(n>0) System.out.println("Positive");
		else System.out.println("Negative");
	}

}

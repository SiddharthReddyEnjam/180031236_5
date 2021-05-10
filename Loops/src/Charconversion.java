import java.util.Scanner;

public class Charconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);
		if(Character.isUpperCase(c)) System.out.println(Character.toLowerCase(c));
		else if(Character.isLowerCase(c)) System.out.println(Character.toUpperCase(c));
		else System.out.println("Enter a valid character");
	}

}

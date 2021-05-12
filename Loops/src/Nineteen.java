/**
 * @author Siddharth
 *
 */
public class Nineteen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();*/
		int i=1,count=0;
		while(i>=1 && count<5)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				count++;
			}
			i++;
		}
	}

}

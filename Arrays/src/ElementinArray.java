import java.util.Scanner;
public class ElementinArray {
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int q=0,toCheckValue,n,index=0;
	        
	        n=sc.nextInt();
	        int arr[]=new int[n];
	        toCheckValue=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	           arr[i]=sc.nextInt();
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	        	if(arr[i]==toCheckValue)
	        	{
	        		q=1;
	        		index=i;
	        	}
	        	else
	        	{
	        		q=0;
	        	}
	        }
	        if(q==1)
	        {
	        	System.out.println(index);
	        }
	        else
	        {
	        	System.out.println(-1);
	        }
	}
}
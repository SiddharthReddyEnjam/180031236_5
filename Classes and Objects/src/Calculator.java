/**
 * @author Siddharth
 *
 */
public class Calculator 
{
	static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
    }
}

class Main 
{
    public static void main(String[] args) 
    {
    	//Calculator c = new Calculator();
    	System.out.println(Calculator.powerInt(5, 8));
    	System.out.println(Calculator.powerDouble(2, 4));
    }
}
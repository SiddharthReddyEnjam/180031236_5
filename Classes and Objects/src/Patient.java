/**
 * @author Siddharth

 *
 */
import java.lang.String;
public class Patient 
{
	String Pn;
	double h,w;
	Patient(String Patientname,double weight,double height)
	{
		Pn = Patientname;
		h = height;
		w = weight;
	}
	double computeBMI()
	{
		return (w/(h*h))*703;
	}
}

class Mains
{
	public static void main(String args[])
	{
		Patient p = new Patient("Siddharth",70,183);
		System.out.println("The Bmi of person is "+p.computeBMI());
	}
}
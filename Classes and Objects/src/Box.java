public class Box {
    double h,w,d;
     Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { 
    	double v;
    	v = h*w*d;
    	return v;
    }
   
    public static void main(String[] args)
    {
    	Box bc = new Box(10,12.5,3.6);
    	System.out.println("The volume of th Box is "+bc.volume());
    }
}
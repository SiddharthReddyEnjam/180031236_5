class Employee
{
	int eid;
	String ename;
	int esal;
	void set(int eid,String ename,int esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	void display()
	{
		System.out.println("Id of the Employee is : "+eid);
		System.out.println("Name of the Employee is : "+ename);
		System.out.println("Salary of the employee is : "+esal);
	}
}
class Main
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.set(180031236,"Siddharth",50000);
		e1.display();
	}
}

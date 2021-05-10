package ConstructorDemo;

class Employeee
{
	int eid;
	String name;
	int salary;
	Employeee()
	{
		System.out.println("Default constructor");
	}
	Employeee(int eid,String name)
	{
		this.eid = eid;
		this.name = name;
	}
	Employeee(int eid,String name,int salary)
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	void display()
	{
		System.out.println("id="+eid+"name:" + name +"Salary="+ salary);
	}
}
public class ConstructorOverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee e1 = new Employeee();
		e1.display();
		Employeee e2 = new Employeee(1800,"Siddharth");
		e2.display();
		Employeee e3 = new Employeee(1800,"Siddharth",100000);
		e3.display();
	}

}

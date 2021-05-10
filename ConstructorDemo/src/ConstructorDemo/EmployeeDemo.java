package ConstructorDemo;
class Employee
{
	int eid,salary;
	String name;
	Employee(int eid,String name,int salary) //Parameterized constructor//no arguments:0argument constructor or Default constructor
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	void display() //method
	{
		System.out.println(eid+":"+name+" salary is "+salary);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(180031236,"siddharth",50000);
		e.display();
		Employee e1 = new Employee(1800,"Siddu",60000);
		e1.display();
	}

}

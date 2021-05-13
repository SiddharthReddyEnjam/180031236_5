/**
 * @author Siddharth
 *
 */
class Animal {
    public void eat()
    {
        System.out.println("eat method");
    }
    public void sleep()
    {
        System.out.println("sleep method");
    }
}

class Bird extends Animal{
    @Override
    public void eat() 
    {
        super.eat();
        System.out.println("eat overrided");
    }
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("sleep overrided");
    }
    public void fly()
    {
        System.out.println("fly method");
    }
}

class Mains
{
    public static void main(String[] args) 
    {
        Animal a =new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}
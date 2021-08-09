

// class, Interface, <Abstrct> class
/**
 * same type to same type -> extends
 * same type to other -> implements
 * 
 * 
 * Abstract
 * 
 * 1. if the function is abstract the class must be abstract
 * 2. you can not create an object of abstract class
 * 3. the child class must override the abstract function of parent
 * 
*/




abstract class Parent
{
    public void greet()
    {
        System.out.println("Hello");
    }
    public void greet(String name)
    {
        System.out.println("Hello, "+name);
    }
    abstract void goodbye();

}
class Child extends Parent
{
    public void greet(String name)
    {
        System.out.println("Hello, "+name+" how are you?");
    }
    public void goodbye(){
        System.out.println("Bye bye");
    }

    public static void main(String args[])
    {
        Child c=new Child();
        c.greet("Nilesh");
        c.goodbye();
    }
}

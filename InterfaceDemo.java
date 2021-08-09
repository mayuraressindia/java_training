
/**
 * ALL the methods in an interface are by default public abstract
 * 
 */

interface Demo{
    public void show();
    public void demo();
}

class InterfaceDemo implements Demo
{
    public void show(){
        System.out.println("Show");
    }
    public void demo(){
        System.out.println("Demo");
    }
    public static void main(String args[])
    {
        InterfaceDemo id=new InterfaceDemo();
        id.show();
        id.demo();
    }
}
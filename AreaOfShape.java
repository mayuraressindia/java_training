

//Overloading
/**
 * defining multiple function/constructor with same name and different argument list
 * 
 */
import java.util.Scanner;
class AreaOfShape
{

    public AreaOfShape(){

    }

    public AreaOfShape(float r){
        area(r);
    }

    public AreaOfShape(float l, float b){
        area(l,b);
    }


    public void area(float r)
    {
        System.out.println("Area of Cicle"+(3.14*r*r));
    }

    public void area(float l, float b)
    {
        System.out.println("Area of Triangle"+(0.5*l*b));
    }




    public static void main(String args[])
    {

       
    }
}
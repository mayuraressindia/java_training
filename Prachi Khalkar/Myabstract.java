



 abstract class Abclass
{

  public abstract void calculate(int a,int b);
}

class Addition extends Abclass
{

    public void calculate(int a,int b)
    {
      int add=a+b;
      System.out.println("Addtion is:"+add);
    }

}

class Subtraction extends Abclass
{

   public void calculate(int a,int b)
       {
         int sub=a-b;
         System.out.println("Subtraction is:"+sub);
    }

}

 class Multiplication extends Abclass
{

    public void calculate(int a,int b)
       {
         int mul=a*b;
         System.out.println("Multiplication is:"+mul);
    }

}


public class Myabstract
{

  public static void main(String args[])
  {

     Addition a=new Addition();
     Subtraction s=new Subtraction();
     Multiplication m=new Multiplication();

     a.calculate(20,30);
	 s.calculate(10,5);
     m.calculate(10,20);




  }


}
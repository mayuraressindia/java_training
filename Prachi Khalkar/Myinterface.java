

interface Bank
{
   void rateofi();
}

class SBI implements Bank
{

  public void rateofi()
  {

     System.out.println("rate of interest of SBI is:5.2");
  }


}

class BOI implements Bank
{

  public void rateofi()
   {

      System.out.println("rate of interest of BOI is:5.1");
  }


}

class PNB implements Bank
{

   public void rateofi()
    {

       System.out.println("rate of interest of PNB is:4.9");
  }

}

class Myinterface
{

  public static void main(String args[])
  {
     SBI s=new SBI();
     BOI b=new BOI();
     PNB p=new PNB();
    Bank ba=new SBI();

     ba.rateofi();
     s.rateofi();
     b.rateofi();
     p.rateofi();


  }
}


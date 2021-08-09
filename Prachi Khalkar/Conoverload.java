


class Conoverload
{

      int empid;
      String name;
      String address;
      Conoverload()
      {
         empid=10;
         name="abc";
      }
      Conoverload(int c,String str)
      {
         empid=c;
         name=str;

      }

       Conoverload(int i,String nm,String add)
      {
         empid=i;
         name=nm;
         address=add;

      }

     public void display()
     {
       System.out.println("emp id is:"+empid);
       System.out.println("emp name is:"+name);


     }


       public static void main(String args[])
       {

        Conoverload c=new Conoverload();
        Conoverload c1=new Conoverload(2,"xyz");

        Conoverload c2=new Conoverload(3,"pqr","nsk");

               c.display();
               c1.display();
               c2.display();

       }





}
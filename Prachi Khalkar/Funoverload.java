


class Funoverload
{


       public void sum(int a,int b)
       {
          int sum1=a+b;
          System.out.println("sum of 2 integers :"+sum1);
       }

       public void sum(int c,int d,int e)
       {
         int sum2=c+d+e;

         System.out.println("sum of 3 integers :"+sum2);

       }
       public void sum(double p,double q)
       {

         double sum3=p+q;
          System.out.println("sum of 2 float numbers :"+sum3);
       }




        public static void main(String args[])
          {

              Funoverload f=new Funoverload();
              f.sum(5,2);
              f.sum(2,3,5);
              f.sum(3.4,2.3);



         }






}
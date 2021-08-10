


class Prime
{
   public static void main(String args[])
   {
      int n=Integer.parseInt(args[0]);
      int flag=0;
      for(int i=2;i<n-1;i++)
      {
          if(n%i==0)
           {
               flag=1;
           }

      }

      if(flag==1)
      {
		  System.out.println("no is not prime");
      }
      else
      {
	      System.out.println("no is prime");
      }


   }

}




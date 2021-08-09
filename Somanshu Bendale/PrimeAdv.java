public class PrimeAdv
{
	public void primeOrNot(int n)
	{
		int count=0;
		if(n==0 || n==1)
		{
			System.out.println("Number "+n+" is not prime");
		}
		else if(n<0)
		{
			System.out.println("Number "+n+" is Negative ");
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("Number "+n+" is prime ");
			}
			else
				System.out.println("Number "+n+" is not prime ");
			}
	}
	public static void main(String args[])
	{
		PrimeAdv p= new PrimeAdv();

		if(args.length==1)
		{
			Integer i=new Integer(args[0]);
			p.primeOrNot(i);

		}
		else
		{
			p.primeOrNot(20);
		}
	}
}
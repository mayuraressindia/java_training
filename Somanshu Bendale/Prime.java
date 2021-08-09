public class Prime
{
	public static void main(String args[])
	{
		int count=0;

			int n=7;
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
}
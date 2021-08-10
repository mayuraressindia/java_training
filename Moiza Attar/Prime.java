//Prime number

public class Prime
{
	public static void main(String args[])
	{
		int n = 7,  count=0;

		for(int i=2; i<n; i++)
		{
			if (n%i == 0)
				{
					count++;
					break;
				}
		}

		if(count == 0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}



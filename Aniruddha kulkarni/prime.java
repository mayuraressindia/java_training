public class prime
{
	public static void main(String args[])
	{
	int n=10;
	boolean flag=false;


	for (int i = 2; i < n ; i++)
	{

		if (n % i == 0)
		{
			flag = true;

		}

	}

		if(flag!=true)
		{
			System.out.println("Number: " +n+ " is a prime number");
		}
		else
		{
			System.out.println("Number: "+n+ " is not a prime number");
	}

	}

}
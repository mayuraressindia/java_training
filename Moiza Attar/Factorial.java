// Factorial Number

public class Factorial
{
	public static void main(String argc[])
	{
		int n = 10, fact = 1;

		for(int i=2; i<=n; i++)
		{
			fact = fact * i;
		}

		System.out.println("Factorial of the number : " +fact);
	}
}

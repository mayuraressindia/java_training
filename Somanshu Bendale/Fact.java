public class Fact
{
	public static void main(String args[])
	{
		int n=5;
		int res=1;

		while(n>0)
		{
			res=res*n;
			n--;
		}
		System.out.println("Factorial is :" +res);
	}
}

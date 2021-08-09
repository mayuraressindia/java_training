public class AreaTriangleParse
{
	public static void main(String args[])
	{
		if(args.length==2)
		{
			double b= Double.parseDouble(args[0]);
			double h= Double.parseDouble(args[1]);
			System.out.println("Area of traingle having breadth: "+b+" and length: "+h+" is:" +(0.5*b*h));
		}
		else
			System.out.println("Enter 2 arguments only!!!!");
	}
}


//Interface


interface Cal
{
	public void calculate();
}

class Rectangle implements Cal
{
	public void calculate()
	{
		int l = 2, b = 3;
		double A1 = 0.5*l*b;
		System.out.println("The Area of rectangle : " +A1);
	}
}

class Square implements Cal
{
	public void calculate()
	{
		int s = 5;
		double A2 = s*s;
		System.out.println("The Area of square    : " +A2);
	}
}


class ShapeCal
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.calculate();

		Square s = new Square();
		s.calculate();
	}
}
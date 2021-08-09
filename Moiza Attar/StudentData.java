
// Constructor Overloading


public class StudentData
{
	String name;
	int Rollno, Age;

	public StudentData()
	{
		name = "Mozia";
		Rollno = 111;
		Age = 20;
	}

   public StudentData(String a, int b, int c)
	{
		System.out.println("Student name is   : " +a);
		System.out.println("Student rollno is : " +b);
		System.out.println("Student age is    : " +c);
    }


public static void main(String args[])
{
	StudentData s = new StudentData();

	System.out.println("Student name is   : " +s.name);
	System.out.println("Student rollno is : " +s.Rollno);
	System.out.println("Student age is    : " +s.Age);


    System.out.println("\n");

	StudentData s2 = new StudentData("Harry", 201, 21);
 }
}
import java.util.*;

class ReadFromKeyboard
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        

        System.out.println("Enter your Full Name:");
        String fullName=sc.nextLine();

        System.out.println("Enter your Full Name:");
        String fName=sc.next();

        System.out.println("Enter your Age:");
        int age=sc.nextInt();




        System.out.println("Full Name:"+fName);
        System.out.println("Full Name:"+fullName);
        System.out.println("Age:"+age);

    }
}
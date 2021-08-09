import java.util.*;


public class cafe
{


 public static void main(String args[])
 {
	  Scanner sc= new Scanner(System.in);

	 	int total_price;
		int cCount=0,mCount=0,sCount=0;
		int cPrice=25,mPrice=30,sPrice=40;
		int ch,bake=25;
		  do
		  {
		   System.out.println("-----$--$--$--$--$--$--$------");
		   System.out.println("Welcome to Aniruddha's cafe");
		   System.out.println("-----$--$--$--$--$--$--$------");
		   System.out.println("1. Press 1 to Place order\n2. Press 2 to Change price\n3. Press 3 to View report\n4. Press 4 to Bake muffin\n5. Press 5 to Exit");
		   System.out.println("Enter your choice: ");
		   ch=sc.nextInt();

			 switch(ch)
		   {
			case 1:
			 int byCoffee=0,bymuffin=0,byshake=0,flag;
			 do
			 {

			  System.out.println("Choose your order:");
			  System.out.println("1.Coffee\n2.Muffin\n3.Shake\n4.Exit");
			  System.out.println("Enter your choice: ");
			  flag=sc.nextInt();
			  switch(flag)
			  {
			   case 1:
				System.out.println("How many coffee you want to buy: ");
				byCoffee=sc.nextInt();
				cCount=cCount+byCoffee;
			   break;
			   case 2:

				 System.out.println("How many Muffins you want to buy: ");
				 bymuffin=sc.nextInt();
				 mCount=mCount+bymuffin;
				 bake=bake-mCount;
				 System.out.println("No. of muffins left: " +bake);


			   break;
			   case 3:
				System.out.println("How many shakes you want to buy: ");
				byshake=sc.nextInt();
				sCount=sCount+byshake;
			   break;
			   case 4:
				System.out.println("Thank you");
			   break;
			   default:
				System.out.println("Enter between 1-4 as a input");

		 	 }

		 }while(flag<4);
		 System.out.println("Your order is:");
		 System.out.println("Coffee\t"+byCoffee+"\t"+(byCoffee*cPrice));
		 System.out.println("Muffin\t"+bymuffin+"\t"+(bymuffin*mPrice));
		 System.out.println("Shake\t"+byshake+"\t"+(byshake*sPrice));
		 System.out.println("**********************");
		 total_price=(byCoffee*cPrice)+(bymuffin*mPrice)+(byshake*sPrice);

		 System.out.println("Total: "+total_price);
		 System.out.println("Amount paid: ");
		 int pay=sc.nextInt();
		 if(total_price<pay)
		  System.out.println("Return "+(pay-total_price)+" rupees");
		 else
		  System.out.println("Thank you");



		break;
		case 2:
		 System.out.println("Select the item you want to change the price of:");
		 System.out.println("1.Coffee\n2.Muffin\n3.Shake\n4.Exit");
		 System.out.println("Enter your choice:");
		 int priceUpdated=sc.nextInt();
		 switch(priceUpdated)
		 {
		  case 1:
		   System.out.println("Enter new price for coffee: ");
		   cPrice=sc.nextInt();
		   System.out.println("New price updated");

		  break;
		  case 2:
		   System.out.println("Enter new price for muffin: ");
		   mPrice=sc.nextInt();
		   System.out.println("New price updated");

		  break;
		  case 3:
		   System.out.println("Enter new price for shake: ");
		   sPrice=sc.nextInt();
		   System.out.println("New price updated");
		  break;
		  case 4:

			 break;

		  default:
		   System.out.println("Enter valid input");

		 }



		break;
		case 3:
		  System.out.println("-----$--$--$--$--$--$--$------");
		  System.out.println("Welcome to Aniruddha's cafe ");
		  System.out.println("-----$--$--$--$--$--$--$------");
		  System.out.println("Coffee \t"+cCount+"\t"+(cCount*cPrice));
		  System.out.println("Muffin \t"+mCount+"\t"+(mCount*mPrice));
		  System.out.println("Shake \t"+sCount+"\t"+(sCount*sPrice));
		  System.out.println("**********************");
		  int report_price=(cCount*cPrice)+(mCount*mPrice)+(sCount*sPrice);
		  System.out.println("Total: "+report_price);
		break;



		case 4:

		bake=bake+25;

		System.out.println("No. of freshly baked muffins: " +bake);
		break;

		case 5:
		System.out.println("Thank you do visit again !!!");
		break;

		default:
		 System.out.println("Enter valid input");
	   }






	  }while(ch<5);



 }


}
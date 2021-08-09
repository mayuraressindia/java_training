import java.util.*;
public class CafeSystem
{
	int noOfMuffins=25;
	void bakeMuffins()
	{
		noOfMuffins+=25;
		System.out.println("25 Muffins freshly baked");
	}

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		CafeSystem c= new CafeSystem();
		int total_price;

		int coffee_count=0,muffin_count=0,shake_count=0;
		int coffee_price=10,muffin_price=20,shake_price=30;
		int ch;
		do
		{
			System.out.println("***************************************");
			System.out.println("\tWelcome to Micra Bistro's");
			System.out.println("***************************************");
			System.out.println("1. Place order\n2. Change price\n3. View report\n4. Bake muffins\n5. Exit");
			System.out.println("Enter yout choice: ");
			ch=sc.nextInt();

			switch(ch)
			{
				case 1:
					int coffee_buy=0,muffin_buy=0,shake_buy=0,or;
					do
					{

						System.out.println("Please choose your order:--");
						System.out.println("1. Coffee\n2. Muffin\n3. Shake\n4. Exit");
						System.out.println("Enter your choice: ");
						or=sc.nextInt();
						switch(or)
						{
							case 1:
								System.out.println("How many coffee u want to buy: ");
								coffee_buy=sc.nextInt();
								coffee_count+=coffee_buy;
							break;
							case 2:
								if(c.noOfMuffins==0)
								{
									System.out.println("Muffins are not available, Please bake Muffins");
									System.out.println("Proceed to bake Muffins(Enter y/n):");
									char muf=sc.next().charAt(0);
									if(muf=='y')
										c.bakeMuffins();
									else
										break;
								}
								else
								{

									System.out.println("How many Muffins u want to buy: ");
									muffin_buy=sc.nextInt();
									muffin_count+=muffin_buy;
									c.noOfMuffins-=muffin_buy;
									System.out.println("Muffins left: "+c.noOfMuffins);

								}
							break;
							case 3:
								System.out.println("How many shakes u want to buy: ");
								shake_buy=sc.nextInt();
								shake_count+=shake_buy;
							break;
							case 4:
								System.out.println("Thank you for the order!!!!!");
							break;
							default:
								System.out.println("Enter the valid input");

						}

					}while(or<4);
						System.out.println("Your order is:");
						if(coffee_buy>0)
							System.out.println("Coffee\t"+coffee_buy+"\t"+(coffee_buy*coffee_price));
						if(muffin_buy>0)
							System.out.println("Muffin\t"+muffin_buy+"\t"+(muffin_buy*muffin_price));
						if(shake_buy>0)
							System.out.println("Shake\t"+shake_buy+"\t"+(shake_buy*shake_price));
						System.out.println("----------------------------------------------------");
						total_price=(coffee_buy*coffee_price)+(muffin_buy*muffin_price)+(shake_buy*shake_price);

						System.out.println("Total:\t\t"+total_price);
						System.out.println("Proceed amount: ");
						int amt_pay=sc.nextInt();
						if(total_price<amt_pay)
							System.out.println("please return "+(amt_pay-total_price)+" rupees");
						else
							System.out.println("Thank you !!!!!!!!!!!!!");



				break;
				case 2:
					System.out.println("Enter the product you want to change the price of:--");
					System.out.println("1. Coffee\n2.Muffin\n3.Shake\n4.Exit");
					System.out.println("Enter your choice:");
					int price_menu=sc.nextInt();
					switch(price_menu)
					{
						case 1:
							System.out.println("Enter new price for coffee: ");
							coffee_price=sc.nextInt();
							System.out.println("New price of coffee is "+coffee_price+" updated");

						break;
						case 2:
							System.out.println("Enter new price for muffin: ");
							muffin_price=sc.nextInt();
							System.out.println("New price of muffin is "+muffin_price+" updated");

						break;
						case 3:
							System.out.println("Enter new price for shake: ");
							shake_price=sc.nextInt();
							System.out.println("New price of shake is "+shake_price+" updated");
						break;
						case 4:

						break;
						default:
							System.out.println("Enter valid input");

					}



				break;
				case 3:
						System.out.println("***************************************");
						System.out.println("\tWelcome to Micra Bistro's");
						System.out.println("***************************************");
						System.out.println("Coffee \t"+coffee_count+"\t"+(coffee_count*coffee_price));
						System.out.println("Muffin \t"+muffin_count+"\t"+(muffin_count*muffin_price));
						System.out.println("Shake \t"+shake_count+"\t"+(shake_count*shake_price));
						System.out.println("--------------------------------------------");

						int report_price=(coffee_count*coffee_price)+(muffin_count*muffin_price)+(shake_count*shake_price);
						System.out.println("Total:-\t"+(coffee_count+muffin_count+shake_count)+"\t"+report_price);

						System.out.println("\nNumber of Muffins in stock: "+c.noOfMuffins);
				break;
				case 4:
					c.bakeMuffins();
					System.out.println("\nNumber of Muffins in stock: "+c.noOfMuffins);


				break;
				case 5:

				break;
				default:
					System.out.println("Enter the valid input");
			}



		}while(ch<5);
	}
}
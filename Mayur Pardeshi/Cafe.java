import java.util.*;

public class Cafe 
{	
	int avaMuffines=0;
	// Bake Muffines function
	public void Bake()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Muffines you want to Bake ?");
		avaMuffines = avaMuffines+sc.nextInt();
		System.out.println(avaMuffines+ " Muffines are available now");
	}
	
	
	public static void main(String[] args)
	{
		Cafe cf = new Cafe();
		Scanner sc = new Scanner(System.in);
		
		int coffeeCnt=0,muffineCnt=0,shakeCnt=0;
		int coffeePrice = 15,muffinePrice=20,shakePrice=20;
		int opt,or;
		
		
		do
		{
			System.out.println("**************************");
			System.out.println("Welcome To Mayur's Cafe");
			System.out.println("**************************");
			System.out.println(" 1. Place Order \n 2. Change Price \n 3. Veiw Report \n 4. Bake Muffines \n 5. Exit");
			System.out.println("Please Select Option");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1: 
						do
						{						
							System.out.println("Choose your Order");
							System.out.println(" 1. Coffee \n 2. Muffines \n 3. Shake \n 4. Exit");
							or = sc.nextInt();
							switch(or)
							{
								case 1: // coffee order 
										System.out.println("How many coffee you want");
										coffeeCnt=sc.nextInt();
										System.out.println(coffeeCnt);
										break;
								case 2: //muffines order 
										System.out.println("How many Muffines you want");
										muffineCnt=sc.nextInt();
										if(cf.avaMuffines<=0 || muffineCnt > cf.avaMuffines)
										{
											System.out.println("Please, Bake Muffines first");
											cf.Bake();
										}
										else{
											cf.avaMuffines= cf.avaMuffines - muffineCnt;
											System.out.println("Avialable Muffines :" +cf.avaMuffines);
											}
										break;
								case 3: //shake order 
										System.out.println("How many Shake you want");
										shakeCnt=sc.nextInt();
										break;
								case 4: 
										break;
							}
						}while(or<4);
						break;
				
				
				case 2:	// change items price 
						System.out.println("Which Item price you want to change ?");
						System.out.println("1. Coffee \n 2. Muffines \n 3. Shake \n 4. Exit \n ");
						int priceChange=sc.nextInt();
						do
						{
							switch(priceChange)
							{
								case 1: System.out.println("Please, Enter new price for Coffee");
										coffeePrice=sc.nextInt();
										System.out.println("Coffe price has been updated");
										break;
								case 2: System.out.println("Please, Enter new price for Muffines");
										muffinePrice=sc.nextInt();
										System.out.println("Muffines price has been updated");
										break;
								case 3: System.out.println("Please, Enter new price for Shake");
										shakePrice=sc.nextInt();
										System.out.println("Shake price has been updated");
										break;
								case 4: 
										break;
							}
						}while(priceChange<4);
						break;
						
						
				case 3: // display report 
						System.out.println("**********TODAY'S REPORT**********");
						System.out.println(" ");
						int totalCofffee=coffeeCnt*coffeePrice;
						int totalMuffines=muffineCnt*muffinePrice;
						int totalShake=shakeCnt*shakePrice;
						int total=totalCofffee+totalMuffines+totalShake;
						System.out.println("Coffee\t"+coffeeCnt+"\t"+totalCofffee);
						System.out.println("Muffine\t"+muffineCnt+"\t"+totalMuffines);
						System.out.println("Shake\t"+shakeCnt+"\t"+totalShake);
						System.out.println("----------------------------------------");
						System.out.println("Total\t\t"+total	);
						System.out.println("Proceed Amount:\t");
						int amt=sc.nextInt();
						System.out.println("Please Return:\t"+ (amt-total));
						System.out.println("----------------------------------------");
						System.out.println("Muffines available:\t"avaMuffines);
						break;
						
						
				case 4: // bake muffines 
						cf.Bake();
						break;
						
						
				default:System.out.println("Please, select valid option");
						
				
				
			}
		}while(opt<5);
		
		
	}
}
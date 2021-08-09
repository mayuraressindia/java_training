
import java.util.*;


class Assignment1
{

   public static void main(String args[])

   {

          int choice,ch,cho;
          String op;


          int coffee=0,muffin=0,shake=0;
          int ccnt=0,mcnt=0,scnt=0;

           int cprice=10,mprice=15,sprice=10;

          int amt,sub,mu;

         Scanner sc=new Scanner(System.in);
      do
      {
      System.out.println("********************************************************************************");
      System.out.println("                      WElcome TO Prachi's Cafe                                 ");
      System.out.println("********************************************************************************");
      System.out.println("Please choose your menu:");
      System.out.println("1. Press 1 to place order");
      System.out.println("2. Press 2 to change price");
      System.out.println("3. Press 3 view report");
      System.out.println("4. press 4 to bake Muffins");
      System.out.println("5.Exit");


      System.out.println("enter your choice:");
      choice=sc.nextInt();

       switch(choice)
       {
		   case 1:


                 do
                 {

                      System.out.println("Choose your order");
				      System.out.println("Press 1 to Coffee");
				      System.out.println("Press 2 to Muffin");
				      System.out.println("Press 3 to Shake");
				      System.out.println("Press 4 to Exit");



                           System.out.println("enter your choice:");
					       ch=sc.nextInt();


					       switch(ch)
                              {

							     case 1:
                                      System.out.println("How many Coffee you want to buy:");
                                      coffee=sc.nextInt();

                                      ccnt+=coffee;
							     break;

							     case 2:
                                       System.out.println("How many Muffin you want to buy:");
                                      muffin=sc.nextInt();
                                      mcnt+=muffin;
							     break;

							     case 3:
                                      System.out.println("How many Shake you want to buy:");
                                      shake=sc.nextInt();
                                      scnt+=shake;
							     break;

							     case 4:

							            System.out.println("your order is:");
								        System.out.println("Coffee              " + coffee+"     "+(coffee*cprice));
									    System.out.println("Muffin              " + muffin +"     "+(muffin*mprice));
									    System.out.println("Shake               " + shake +"      "+(shake*sprice));

								        System.out.println("-----------------------------------------------------------");
									    System.out.println("Total                        "+((coffee*cprice)+(muffin*mprice)+(shake*sprice)));


									     System.out.println("Proceed Amount:");
									     amt=sc.nextInt();

									     sub=amt-((coffee*cprice)+(muffin*mprice)+(shake*sprice));
							              System.out.println("Please return    "+sub +"Rs");



							     break;




                           }



                   }while(ch!=4);


		   break;

		   case 2:

		                          do
		                          {

                                      System.out.println("which item price you want to change :");
				 				      System.out.println("1.Coffee");
				 				      System.out.println("2.Muffin");
				 				      System.out.println("3.Shake");
				 				      System.out.println("4.Exit");

				 				      System.out.println("enter your choice:");
					                   cho=sc.nextInt();

					                   switch(cho)
					                   {

                                         case 1:
                                            System.out.println("please Enter new Price for Coffee:");
                                            cprice=sc.nextInt();
                                            System.out.println("Coffee price has been updated."+cprice);

										 break;

										 case 2:
                                             System.out.println("please Enter new Price for muffin:");
                                             mprice=sc.nextInt();
                                             System.out.println("muffin price has been updated."+mprice);
										 break;

										 case 3:
                                               System.out.println("please Enter new Price for Shake:");
                                               sprice=sc.nextInt();
                                               System.out.println("muffin price has been updated."+sprice);
										 break;

										 case 4:
										      System.out.println("Exit");
										 break;





									    }



								}while(cho!=4);


		   break;

		   case 3:




		      System.out.println("********************************************************************************");
			  System.out.println("                      WElcome TO Prachi's Cafe                                 ");
			  System.out.println("********************************************************************************");
              System.out.println();
              System.out.println();
              System.out.println();
              System.out.println("Coffee              " + ccnt +"     "+(ccnt*cprice));
	          System.out.println("Muffin              " + mcnt +"     "+(mcnt*mprice));
			  System.out.println("Shake               " + scnt +"      "+(scnt*sprice));

			  System.out.println("-----------------------------------------------------------");
			     System.out.println("Total                        "+((ccnt*cprice)+(mcnt*mprice)+(scnt*sprice)));

              System.out.println("Total Muffin's Baked : 50");


              mu=50-mcnt;
              System.out.println("Muffines left :"+mu);



		   break;

		   case 4:
                  System.out.println("25 muffins Baked");
		   break;

		   case 5:
		     System.exit(0);
		   break;









	   }



 }while(choice!=5);


















 }


}
interface Animal
{
  public void animalSound();
  public void sleep();
}


class catIntf implements Animal
{
  public void animalSound()
  {

    System.out.println("The cat says: Meowwwww");
  }
  public void sleep()
  {

    System.out.println("zzzzz");
  }



  public static void main(String[] args)
  {
    catIntf myCat = new catIntf();
    myCat.animalSound();
    myCat.sleep();
  }
}
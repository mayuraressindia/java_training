
//Abstraction

abstract class AbstractDemo
{
	public abstract void sound();
}

class Dog extends AbstractDemo
{
	public void sound()
	{
		System.out.println("The sound of the dog is bark ");
	}
}

class Cat extends AbstractDemo
{
	public void sound()
		{
			System.out.println("The sound of the cat is maooo");
	    }

}

class Abstract
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();
	}

}
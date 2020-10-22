package Abstraction;


abstract class Dog {
	String breed;
	
	public void bark() {
		System.out.println("bark!");
	}
	
	public abstract void run();
}

class Chihuahua extends Dog {
	//can use methods inside of dog parent class
	public void run() {
		System.out.println("dog ran");
	}
}

public class AbstactTutorial {

	public static void main(String[] args) {
		
		Chihuahua puppy = new Chihuahua();
		puppy.bark();
		puppy.run();
		
		

	}

}

package pratice;

public class Polymorphism {
	
	public void animalsound() {
		System.out.println("Animal makes sound");
	}
	
}
	
class Pig extends Polymorphism {
	public void animalsound() {
		System.out.println("pig makes ewe ewe");
	}
}
	

class Dog extends Polymorphism{
	public void animalsound() {
		System.out.println("dog makes bow bow");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism obj1 = new Polymorphism();
		Pig obj2 = new Pig();
		Dog obj3 = new Dog();
		
		obj1.animalsound();
		obj2.animalsound();
		obj3.animalsound();

	}
}




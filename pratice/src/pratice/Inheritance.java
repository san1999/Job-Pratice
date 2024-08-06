package pratice;
//single inheritance
public class Inheritance {
     public	void eat() {
		System.out.println("Animals will eat");
		}
}
class Cat extends Inheritance{
		void dog() {
			System.out.println("cat say mew mew");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj = new Cat();
		obj.eat();
		obj.dog();
		
		
	}

}



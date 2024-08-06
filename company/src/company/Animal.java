
package company;

public class Animal{
public void animalsound(){

System.out.println("Animal makes sound");
}
}
class Dog extends Animal{
public void animalsound(){
System.out.println("dog makes sound");
}
}

class main
{
public static void main(String[] args)
{

Animal obj=new Animal();
Dog obj1 = new Dog();

obj.animalsound();
obj1.animalsound();
}
}








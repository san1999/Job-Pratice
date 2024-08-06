package pratice;

import java.util.Scanner;

public class Swap {

	public void method10(){
		int x,y;
		System.out.println("Enter 2 numbers to swap");
		Scanner obj = new Scanner(System.in);
		x=obj.nextInt();
		y=obj.nextInt();
		
		System.out.println("Before swap = "+ x+","+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap = "+ x+","+y);
		
		
		

	}

}

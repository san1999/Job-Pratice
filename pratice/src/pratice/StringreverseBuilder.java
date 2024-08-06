package pratice;

import java.util.Scanner;

public class StringreverseBuilder {

	public void method2(){
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter a string to reverse");
		Scanner obj = new Scanner(System.in);
		s=obj.nextLine();
		StringBuffer rev = new StringBuffer(s);
		
		System.out.println("string reversed "+"\n"+rev.reverse());

	}

}

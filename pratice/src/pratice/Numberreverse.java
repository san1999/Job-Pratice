package pratice;

import java.util.Scanner;

public class Numberreverse {

	public void method7() {
		// TODO Auto-generated method stub
		
		int num,rev=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		num=obj.nextInt();
		
		while(num>0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("reverse number is : "+rev);

	}

}

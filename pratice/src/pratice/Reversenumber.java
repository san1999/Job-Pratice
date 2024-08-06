package pratice;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		num=sc.nextInt();
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse number is :"+rev);

	}

}

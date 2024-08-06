package pratice;

import java.util.Scanner;

public class Numberpalindrome {

	public void method8() {
		// TODO Auto-generated method stub
		
		int num1 = 0,num,rev=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome");
		num=obj.nextInt();
		
		num1=num;
		
		  while(num>0) 
		  { 
			rev=rev*10 + num%10; 
		  	num=num/10;
		  
		  } 
		  if(num1 == rev) {
			  System.out.println("Given number is palindrome");
		  } 
		  else {
			  System.out.println("Given number is not palindrome");
		  }
		 

	}

}

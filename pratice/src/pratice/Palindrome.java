package pratice;

import java.util.Scanner;

public class Palindrome {

	public void method4() {
		// TODO Auto-generated method stub

		String s,s1="";
		int l,i;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse");
		
		s=obj.nextLine();
		
		l=s.length();
		
		for(i=l-1;i>=0;i--)
		
		{
			s1=s1+s.charAt(i);
			
		}
		if(s.equals(s1)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not palindrome");
		}
	}

}

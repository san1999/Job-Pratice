package pratice;

import java.util.Scanner;

public class Outputpalindrommestring {

	public void method5(){
		// TODO Auto-generated method stub

		String s,s1="",s2;
		int l,i;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a string to change string into palindrome");
		
		s=obj.nextLine();
		
		l=s.length();
		
		for(i=l-1;i>=0;i--)
		
		{
			s1=s1+s.charAt(i);
			
		}
		s2=s1.substring(1);
		
		System.out.println(s+s2);
		
	}

}

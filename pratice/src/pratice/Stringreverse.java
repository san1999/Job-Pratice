package pratice;

import java.util.Scanner;

public class Stringreverse {

	public void method3() {
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
		System.out.println(s1);
	}

}

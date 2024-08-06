package pratice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str,str1="";
		int len;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a string");
		str=sc.nextLine();
		
		len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			str1=str1+str.charAt(i);
		}
		
		System.out.println("String reverse:"+str1);
		if(str.equals(str1)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
	}

}

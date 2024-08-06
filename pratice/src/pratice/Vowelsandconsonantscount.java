package pratice;

import java.util.Scanner;

public class Vowelsandconsonantscount {

	public void method6(){
		
		String str,str1;
		int v=0,c=0,l;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a string");
		str=obj.nextLine();
		
		str1=str.toLowerCase();
		
		l=str1.length();
		
		for(int i=0;i<l;i++)
		{
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
				v++;
			}else {
				c++;
			}
		}
		System.out.println("Vowels count : " +v + "\n"+"consonant count : " +c);
	}

}

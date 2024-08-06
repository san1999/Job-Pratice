package pratice;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		int num;
		System.out.println("Welcome");
		System.out.println("choose the below options");
		System.out.println("1.Fibb\n2.StringreverseBuilder\n3.Stringreverse\n4.StringPalindrome\n5.Outputpalindrommestring\n6.Vowelsandconsonantscount\n7.Numberreverse\n8.Numberpalindrome\n9.Prime\n10.Swap");
		Scanner sc = new Scanner(System.in);
		
		num=sc.nextInt();
		
		if(num==1) 
		{
			
		Fib obj1 = new Fib();
		obj1.method1();
		
		}
		else if(num==2)
		{
		
		StringreverseBuilder obj2 = new StringreverseBuilder();
		obj2.method2();
		}
		else if(num==3)
		{
		
			Stringreverse obj3 = new Stringreverse();
			obj3.method3();
		}
		else if(num==4)
		{
			Palindrome obj4 = new Palindrome();
			obj4.method4();
		}
		else if(num==5)
		{
			Outputpalindrommestring obj5 = new Outputpalindrommestring();
			obj5.method5();
		}
		else if(num==6)
		{
			Vowelsandconsonantscount obj6 = new Vowelsandconsonantscount();
			obj6.method6();
		}
		else if(num==7)
		{
			Numberreverse obj7 = new Numberreverse();
			obj7.method7();
		}
		else if(num==8)
		{
			Numberpalindrome obj8 = new Numberpalindrome();
			obj8.method8();
		}
		else if(num==9)
		{
			Prime obj9 = new Prime();
			obj9.method9();
		}
		else if(num==10)
		{
			Swap obj10 = new Swap();
			obj10.method10();
		}
		else {
			System.out.println("choose from above numbers");
		}
		System.out.println("Thank you");

	}

}

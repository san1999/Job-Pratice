package pratice;

import java.util.Scanner;

public class Fibbno {
// 0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,n1=0,n2=1,n3=0;
		
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
	
		System.out.print(n1+" "+n2);
	
	
		for(int i=2;i<n;i++) 
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
	}

}

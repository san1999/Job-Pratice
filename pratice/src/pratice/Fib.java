//0 1 1 2 3 5 8 13 21
package pratice;

import java.util.Scanner;

public class Fib {

	public void method1() {
		
			int n,n1=0,n2=1,n3=0;
		
			System.out.println("enter a number for series");
			Scanner obj = new Scanner(System.in);
			n=obj.nextInt();
		
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

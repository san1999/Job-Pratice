package pratice;

import java.util.Scanner;

public class Prime {

	public void method9(){
		
		int n,i,count = 0;
		
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter a number to check");
		
		n=obj.nextInt();
		
		for(i=1;i<=n;i++) {
			if(n % i == 0)
				count++;
		}
			if(count == 2) {
				System.out.println("given number "+n+" is prime");
			}else {
				System.out.println("given number "+n+" is not prime");
			}

	}

}

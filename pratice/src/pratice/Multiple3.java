package pratice;

import java.util.Scanner;

public class Multiple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%3 != 0)
			System.out.println(i);
		}
		
	}
}
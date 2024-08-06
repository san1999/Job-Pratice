package pratice;

import java.util.Scanner;

public class Primestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,len,count=0;
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		num=sc.nextLine();
		
		len=num.length();
		System.out.println("1");
		for(int j=2;j<=len;j++) 
		{
			count=0;
			
			for( i=1;i<=j;i++)
			{
				if(j%i==0) 
				{
					count++;
				}
			}
			//System.out.println("count :"+count);
			if(count == 2)
			System.out.println(j);
			
		}
	}

}

package pratice;

import java.util.Scanner;

public class Primeinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		num=sc.nextInt();
		System.out.println("1");
		for(int j=2;j<=num;j++) 
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





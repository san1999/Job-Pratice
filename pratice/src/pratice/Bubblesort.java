package pratice;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter size of arr");
		int s = obj.nextInt();
		
		int arr[]=new int[s];
		
		for(i=0;i<s;i++)
		{
			System.out.printf("enter a number arr[%d]",i);
			arr[i]=obj.nextInt();
		}
		int len = arr.length;
		
		
		for(i=0;i<len-1;i++)
		{
			for(j=0;j<len-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<len;i++)
		{
			System.out.println("sorted arr:"+arr[i]);
		}

	}

}

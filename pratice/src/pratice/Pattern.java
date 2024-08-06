package pratice;

public class Pattern {

	public static void main(String[] args) {
		int n=5,col = 0,row,space;
		System.out.println("First pattern");
		for(row=1;row<=n;row++) {
			for(col=1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	System.out.println("second pattern");
	for(row=1;row<=n;row++) {
		for(col=1;col<=row;col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("Third pattern");
	for(row=1;row<=n;row++) {
		for(col=1;col<=n-row+1;col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("Fourth pattern");
	for(row=1;row<=n;row++) {
		for(col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	System.out.println("5 pattern");
	for(row =1;row<=n;row++) {
		for(space =1;space<=n-row;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=row;col++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("6 pattern");
	for(row=1;row<=n;row++) {
		for(space=1;space<=row-1;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=n-row+1;col++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("7 pattern");
	for(row=1;row<=n;row++) {
		for(space=1;space<=n-row;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=row;col++) 
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("8 pattern");
	for(row=1;row<=n;row++) {
		for(space=1;space<=row-1;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=n-row+1;col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("9 pattern");
	for(row=1;row<=n;row++) {
		for(space=1;space<=row-1;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=n-row+1;col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(row=1;row<=n;row++) {
		for(space=1;space<=n-row;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=row;col++) 
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("10 pattern");
	for(row=1;row<=n;row++) {
		for(space=1;space<=n-row;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=2*row-1;col++) {
			System.out.print(col +" ");
		}
		System.out.println();
	}
	System.out.println("11 pattern");
	for(row=1;row<=n;row++)
	{
		for(space=1;space<=row-1;space++) {
			System.out.print(" ");
		}
		for(col=1;col<=n-row+1;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
}

}

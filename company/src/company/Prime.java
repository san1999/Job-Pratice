package company;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=2,num2=5;
		int count=0,sum=0,inc=0;
		
		while(num1<num2)
		{
		    for(int i=1;i<=num1;i++)
		    if(num1%i==0)
		    count++;
		    {
		        if(count==2){
		            System.out.println(num1);
		            sum =num1+sum;
		            inc++;
		            
		    
		        }
		    }
		    num1++;
		    count=0;
		}
		
		float average = (sum/inc);
		System.out.println(average);
	}

}

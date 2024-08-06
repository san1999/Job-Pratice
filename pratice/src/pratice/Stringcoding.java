package pratice;

public class Stringcoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		String str = "sandeep";
		String str1="";
		
		int length = str.length();
		
		for(i=length-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println("Reversed string is :"+str1);
		System.out.println();
		
		System.out.println("remove special characters");
		String str2 = "s@a$nde%%ep";
		System.out.println("given string:"+str2);
		String orginalstring = str2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("after remover special character:"+orginalstring);
		System.out.println();
		
		System.out.println("remove spaces");
		String str3="s an  d e e  p";
		System.out.println("given string:"+str3);
		String orginal=str3.replaceAll("\\s", "");
		System.out.println("string without spaces:"+orginal);
		System.out.println();
		
		
		System.out.println("remove duplicate characters");
		
		char []arr=str.toCharArray();
		StringBuilder obj = new StringBuilder();
		
		
		
		for(i=0;i<arr.length;i++) {
			boolean flag=false;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
				
			}
			if(!flag) {
				obj.append(arr[i]);
				
				
			}
			
		}
		System.out.println("string without duplicate characters:"+obj);
		System.out.println();
		
		System.out.println("print string with alphabetical order");
		
		char arr1[] = str.toCharArray();
		
		char temp;
		
		for(i=0;i<arr1.length-1;i++) {
			for(j=0;j<arr1.length-1;j++) {
				
				if(arr1[j]>arr1[j+1])
				{
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					
				}
			}
			
		}
		System.out.println("order string:"+new String(arr1));
		
	}

}

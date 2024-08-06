package pratice;

public class Stringnumbersum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,sum=0;
		
		String str= "1hbjsb1bhsbjd3bsbd5";
		
		int length = str.length();
		
		for(i=0;i<length;i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
			
		
	}

}

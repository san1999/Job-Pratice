package pratice;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "sanas";
	      String s1="";
	      
	      int length=s.length();
	      
	      for(int i=length-1;i>=0;i--)
	      {
	          s1=s1+s.charAt(i);
	      }
	      if(s.equals(s1))
	      {
	          System.out.println("Given string is palindrome");
	      }else{
	          System.out.println("not palindrome");
	      }
	}

}

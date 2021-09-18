package week3.day1assign;

public class CompareString {
	
	//.equalsIgnoreCase ignores even if it is case sensitive

	public static void main(String[] args) {
		String str1="I am Learning Java";
		String str2="I am learning java";  
		
		
		  if(str1==str2) {
		  System.out.println("Two strings are same with == opearator"); }
		 
		 
		  if(str1.equals(str2)) {
		  System.out.println("Two strings are same with .equals opearator"); }
		  
		  
		
		  if(str1.equalsIgnoreCase(str2)) {
		  System.out.println("Two strings are same with .equalsIgnoreCase opearator");
		  }
		 
		 
			

				

	}

}

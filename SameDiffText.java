package week3.day1assign;

public class SameDiffText {

	public static void main(String[] args) {

		String str3 = new String("Kutty");

		String str4 = new String("Kutty");

		if (str3.equals(str4)) {

			System.out.println(" Same text with .equals operator");
		}
		if(str3==str4) {
			System.out.println("Same text with == operator");
		}

		else

			System.out.println("Diff text");

		System.out.println("***");

		/*
		 * Justify the above output 
		 * .equals of compares the value of differents string objects so same text is printed 
		 * == operator in string declaration it is comparing two different objects.so printed diff text
		 */

	}

}

package week3.day1assign;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		String sentencerep=sentence.replace('k', 'g');
		System.out.println("Replace index 8 to 11 is : " + sentencerep);
		String substr=sentencerep.substring(5, 15);
		System.out.println("String fro index 5 to 14 is: " + substr);
		


	}

}

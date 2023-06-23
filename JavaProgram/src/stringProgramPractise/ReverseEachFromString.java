package stringProgramPractise;

public class ReverseEachFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "I am working with testing team";
		String[] words = inputString.split(" ");
		String reverseString="";
		for(int i = 0; i<words.length;i++) {
			String word = words[i];
			String reverseWord = "";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.print(reverseString);
	}

}

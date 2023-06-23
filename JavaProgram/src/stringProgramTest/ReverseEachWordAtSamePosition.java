package stringProgramTest;

public class ReverseEachWordAtSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "I am working in Annular Technologies since 2020";
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			String word = words[i];
			String reverseWord = "";
			System.out.print("length :"+word.length());
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
       System.out.print(reverseString);
	}

}

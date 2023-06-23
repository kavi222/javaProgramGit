package strings;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "hello world";

		// split the given string into words so we are splitting it by space
		String[] words = inputString.split(" ");
		// for storing the reversed string we taking the variable and set it as null
		// initially
		String reverseString = "";

		// looping the splited word and store it in word variable and set variable
		// reverseWord which should be null initially
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			// looping each character and storing it reverseWord
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";

		}

		System.out.println(reverseString);

	}
}

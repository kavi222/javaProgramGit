package stringProgramTest;

public class CheckVowelsPresentOrNotUsingCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Bcdfghjkl";
		inputString = inputString.toLowerCase();
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("The given string contains vowel letters");
		} else {
			System.out.println("The given string does not contains any vowel letters");
		}

	}

}

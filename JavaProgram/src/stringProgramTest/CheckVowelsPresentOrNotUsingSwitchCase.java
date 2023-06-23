package stringProgramTest;

public class CheckVowelsPresentOrNotUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "KAviArasu";
		inputString = inputString.toLowerCase();
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		if (count != 0) {
         System.out.println("The given string does not contains any vowels letters");
		}else {
			System.out.println("The given string contains vowel letters");
		}
	}

}

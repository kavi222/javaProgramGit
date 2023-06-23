package stringProgramPractise;

public class FirstRepeatedLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kaviarasu";
		boolean repeat = false;
		char ch = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				System.out.print(ch + " : repeated");
				repeat = true;
				break;
			}
		}
		if (repeat == false) {
			System.out.print("not repeated");
		}

	}

}

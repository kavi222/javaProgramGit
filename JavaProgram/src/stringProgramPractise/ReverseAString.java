package stringProgramPractise;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kaviarasu";
		String reverseString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverseString = reverseString + s.charAt(i);
		}
		System.out.print(reverseString);
	}

}

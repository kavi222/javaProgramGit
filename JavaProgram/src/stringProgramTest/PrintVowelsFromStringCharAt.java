package stringProgramTest;

public class PrintVowelsFromStringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "KaviArasu";
		inputString=inputString.toLowerCase();
		for(int i = 0; i<inputString.length();i++) {
			char ch = inputString.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch);
			}
		}
	}
}

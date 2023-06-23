package stringProgramTest;

public class PrintVowelsFromStringUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "KaviArasu";
		inputString = inputString.toLowerCase();
		for(int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.print(ch);
			}
		}

	}

}

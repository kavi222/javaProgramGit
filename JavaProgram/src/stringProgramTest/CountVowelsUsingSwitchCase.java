package stringProgramTest;

public class CountVowelsUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "KaviArasu";
		inputString = inputString.toLowerCase();
		int count = 0;
		for(int i=0; i < inputString.length();i++) {
			char ch = inputString.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': count++;
			}
		}
       System.out.print(count);
	}

}

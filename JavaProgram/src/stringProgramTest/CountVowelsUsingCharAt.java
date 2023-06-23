package stringProgramTest;

public class CountVowelsUsingCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "KaviArasu";
		int count =0 ;
		inputString=inputString.toLowerCase();
		for(int i = 0; i < inputString.length();i++) {
			char ch = inputString.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.print("Total count of vowels from the given String : "+count);
	}

}

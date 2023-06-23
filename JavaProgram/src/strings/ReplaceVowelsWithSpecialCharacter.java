package strings;

public class ReplaceVowelsWithSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String giventext ="I miss my School Days";
		char[] ch = giventext.toCharArray();
		for(int i = 0;i<giventext.length();i++) {
			if(giventext.charAt(i)=='A' || giventext.charAt(i)=='E' || giventext.charAt(i)=='I' || giventext.charAt(i)=='O' || giventext.charAt(i)=='U' || giventext.charAt(i)=='a' ||
					giventext.charAt(i)=='e' || giventext.charAt(i)=='i' || giventext.charAt(i)=='o' || giventext.charAt(i)=='u') {
				ch[i]='*';
			}
		}
		System.out.println(ch);

	}

}

package strings;

public class PrintOnlyVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kaviarasu"; 
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch);
			}
		}

	}

}

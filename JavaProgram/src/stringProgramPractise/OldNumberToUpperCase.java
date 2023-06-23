package stringProgramPractise;

public class OldNumberToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Kaviarasu";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0) {
				if (ch[i] >= 'a' && ch[i] <= 'z') {

					ch[i] = (char) (ch[i] - 32);
				}
			}
			System.out.print(ch[i]);
		}
	}

}

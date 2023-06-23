package stringProgramPractise;

public class FirstCharacterToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "kaviarasu";
		char[] ch=str.toCharArray();
		ch[0]=(char) (ch[0] - 32);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}

}

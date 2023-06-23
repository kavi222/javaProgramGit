package stringProgramPractise;

public class FirstCharacterToUpperCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="kaviarasu";
		char[] ch=str.toCharArray();
		ch[0]=(char) (ch[0]-32);
		str = new String(ch);
        System.out.print(str);
	}

}

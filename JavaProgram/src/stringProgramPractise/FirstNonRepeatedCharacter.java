package stringProgramPractise;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kaviarasu";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			boolean repeat = false;
			for(int j =i+1;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					repeat=true;
					break;
				}
			}
			if(repeat==false) {
				System.out.println(ch+" not repeated");
				break;
			}
		}

	}

}

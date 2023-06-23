package strings;

public class FirstLetterRepeatedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "window";
		char ch = word.charAt(0);
		boolean repeat=false;
		for(int i=1;i<word.length();i++) {
			if(ch==word.charAt(i)) {
				System.out.print(ch+" : repeated");
				repeat=true;
				break;
			}
			
		}
		if(repeat==false)
			System.out.print(ch+": not repeated");
		
	}

}

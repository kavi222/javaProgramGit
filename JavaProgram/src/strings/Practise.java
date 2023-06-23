package strings;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "WOWA";
		String word1="";
		
		System.out.println(word.length()); 
		System.out.println(word.charAt(2)); 
		
		for(int i = word.length()-1; i>=0;i--) {
			word1=word1+word.charAt(i);
		}
		System.out.println(word1);
		
		if(word.equalsIgnoreCase(word1)) {
			System.out.println("Is palindrome");
		}
		else {
		System.out.println("Is not palindrome");
		}
	}
}

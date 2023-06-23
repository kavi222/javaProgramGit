package strings;

public class RS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "hello world";
		String word2="";
		//System.out.println(word.charAt(3));
		
		//System.out.println(word.length());
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println("---------------");
		for(int i=word.length()-1;i>=0;i--) {
			word2=word2+word.charAt(i);
		}
		System.out.println(word2);
		if(word.equalsIgnoreCase(word2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not an Palindrome");
		}
	}
}

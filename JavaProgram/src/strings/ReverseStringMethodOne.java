package strings;

public class ReverseStringMethodOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "ABCD";
		String word2="";
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
		
		for(int i=word.length()-1;i>=0;i--) {
			word2=word2 +word.charAt(i);
		}
		System.out.println(word2);

	}

}

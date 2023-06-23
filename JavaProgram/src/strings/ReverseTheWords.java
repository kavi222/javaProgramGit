package strings;

public class ReverseTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am working in Annular Technologies";
		String[] words=input.split(" ");
		System.out.println("return first index: "+words[1]);
		String reverseString="";
		for(int i =0; i<words.length;i++) {
			System.out.println("words : "+words.length);
			String word = words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				System.out.println("word : "+word.length());
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.print(reverseString);

	}

}

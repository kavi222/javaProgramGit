package strings;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "I am working from my office"; 
		String[] words = inputString.split(" "); //0--> hello, 1 --> world
		String reverseString = "";
		//System.out.print(words.length);
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseWord = "";
			System.out.println(word);
			for(int j = word.length()-1;j>=0;j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
	    
      System.out.println(reverseString);
	}
}

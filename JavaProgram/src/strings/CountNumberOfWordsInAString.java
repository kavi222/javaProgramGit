package strings;

public class CountNumberOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java programming question ";
		int words=str.split(" ").length;
		System.out.print(words);
	}

}

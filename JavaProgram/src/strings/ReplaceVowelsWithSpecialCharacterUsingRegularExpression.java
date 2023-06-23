package strings;

public class ReplaceVowelsWithSpecialCharacterUsingRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "KaviArasu";
		//str=str.toLowerCase();
		String replacedStr = str.replaceAll("[AEIOUaeiou]", "*");
        System.out.println(replacedStr);
	}

}

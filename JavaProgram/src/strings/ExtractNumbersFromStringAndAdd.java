package strings;

public class ExtractNumbersFromStringAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "kaviarasu12344321";
		int total =0;
		for(int i=0;i<input.length();i++) {
			char character = input.charAt(i);
			if(Character.isDigit(character)) {
				total = total + Character.getNumericValue(character);
			}
		}
		System.out.print(total);

	}

}

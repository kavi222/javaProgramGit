package stringProgramTest;

public class PrintOnlyAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Kaviarasu123456";
		inputString = inputString.toLowerCase();
		inputString= inputString.replaceAll("[0-9]", "");
		System.out.println(inputString);

	}

}

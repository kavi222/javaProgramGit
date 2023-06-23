package stringProgramTest;

public class PrintOnlyNumberFromTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Kavi1234";
		inputString=inputString.toLowerCase();
		inputString = inputString.replaceAll("[a-z]", "");
		System.out.println(inputString);
	}

}

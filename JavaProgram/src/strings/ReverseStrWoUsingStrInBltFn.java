package strings;

public class ReverseStrWoUsingStrInBltFn {

	public static void main(String[] args) {
		
		String str = "Automation";
		String str1 = "Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
	}
}

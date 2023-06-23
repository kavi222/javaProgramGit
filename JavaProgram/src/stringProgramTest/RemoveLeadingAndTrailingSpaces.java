package stringProgramTest;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =" Hello world !! ";
		/*
		 * 1.Using trim
		 * 2.Using Strip (Java11)
		 *     1.strip()
		 *     2.stripLeading()
		 *     3.stripTrailing();
		 * 3.Using regex
		 *    1.^[ \t]+ | [ \t] + $ -> leading and trailing
		 *    2.^[ \t]+ -> leading
		 *    3.[ \t]+$ -> trailing
		 * 
		 */
		System.out.println(s.trim());
		System.out.println(s.strip());
		System.out.println(s.stripTrailing());
		System.out.println(s.stripLeading());
		System.out.println(s.replaceAll("^[ \t]+ | [ \t]+$", ""));
		System.out.println(s.replaceAll("^[ \t]+", ""));
		System.out.println(s.replaceAll("[ \t]+$", ""));

	}

}

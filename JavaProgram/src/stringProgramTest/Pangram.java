package stringProgramTest;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Abcd   efghijklmnopqrstuvwxyz";
		s=s.replaceAll("\\s", "").toLowerCase();
		System.out.print(isPangram(s));

	}
	
	public static boolean isPangram(String s) {
		Set<Character> hs = new HashSet<>();
		for(char ch : s.toCharArray()) {
			hs.add(ch);
		}
		return hs.size() == 26;
	}

}

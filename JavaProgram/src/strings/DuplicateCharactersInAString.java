package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		printDuplicateUsingMap(str);
		printDuplicateUsingSet(str);

	}

	public static void printDuplicateUsingSet(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (set.contains(ch)) {
				System.out.println(ch);
			} else {
				set.add(ch);
			}
		}
	}

	public static void printDuplicateUsingMap(String str) {
		
		Map<Character, Integer> charMapCount = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (charMapCount.containsKey(ch)) {
				charMapCount.put(ch, charMapCount.get(ch) + 1);
			} else {
				charMapCount.put(ch, 1);
			}
		}

		charMapCount.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k);
			}
		});
	}
}

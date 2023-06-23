package strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfEachCharacterInAString {
	
	/*
	 * Java program to count occurrences of each character in a string
	 * Source: http://webrewrite.com
	 * str  = Java
	 * {J:1, a:2, v:3}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming";
		/* use of hashMap which allows us to store key and value pair, where keys should be unique, if you try to insert 
		the duplicate key, it will replace the element of the corresponding key
		*/
		Map<Character, Integer> charMapCount = new HashMap<>();
		System.out.println(charMapCount);
		for(Character c: str.toCharArray()) {
			//System.out.println(c);	
			if(charMapCount.containsKey(c)) {
				charMapCount.put(c, charMapCount.get(c)+1);
			}else {
				charMapCount.put(c, 1);
			}
			
		}
		System.out.println(charMapCount);
	}
}

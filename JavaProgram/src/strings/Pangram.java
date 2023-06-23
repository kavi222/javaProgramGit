package strings;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * FInd the missing alphabet in the given string Pangram -> if a given statement
		 * is having all the english alphabets. example -> input="a", missing b to z
		 * 
		 * Steps: 1.Convert the string to a uniform case(lower/upper) 2.remove the space
		 * if there's any 3.store the input into a string array 4.create a string array
		 * with english alphabets 5.create two hashsets, one with user input nd other
		 * with alphabets. 6.compare the two sets and foind the missing cahracters.
		 */
		Pangram n = new Pangram();
		System.out.println(checkIfPangram("I am working"));
		String s = "Abcd   efghijklmnopqrstuvwxyz";
		s = s.replaceAll("\\s", "");
		System.out.println(checkIfPangram(s.toLowerCase()));
	}

	public static boolean checkIfPangram(String sentence) {

		Set<Character> seen = new HashSet<>();
		for (char currChar : sentence.toCharArray()) {
			seen.add(currChar);
		}

		return seen.size() == 26;

	}

}

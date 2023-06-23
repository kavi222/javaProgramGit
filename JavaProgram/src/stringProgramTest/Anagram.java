package stringProgramTest;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "restful";
		String t = "fluster";
		System.out.println(isAnagram(s,t));

	}
	
	public static boolean isAnagram(String s, String t) {
		char a[]=s.strip().toLowerCase().toCharArray();
		char b[]=t.strip().toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			return true;
		}else {
			return false;
		}
	}

}

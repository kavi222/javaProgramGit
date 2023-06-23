package stringProgramTest;

import java.util.Scanner;

public class LengthOfStrWOLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Name: " + str);
		int length=0;
		char[] arr = str.toCharArray();
		for(char c : arr) {
			length++;
		}
		System.out.println("length: " + length);

	}

}

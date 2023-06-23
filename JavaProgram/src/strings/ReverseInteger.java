package strings;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Formula or logic:
		 * loop until num not equal to 0
		 * reversed = reversed*10
		 * reversed =reversed+given%10
		 * given=given/10
		 */
		
		int givenNumber = 0;
		int reversedNumber=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		givenNumber=sc.nextInt();
		while(givenNumber!=0) {
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;
			givenNumber=givenNumber/10;
		}
		System.out.println(reversedNumber);

	}

}

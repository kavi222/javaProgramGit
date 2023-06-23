package pattern;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines: ");
		int numberOfLines = sc.nextInt();
		int row=0;
		int column=0;
		for(row=0;row<numberOfLines-1;row++) {
			for(column=0;column<=row;column++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

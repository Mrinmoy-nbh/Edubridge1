package Edubridge;

import java.util.Scanner;

public class Day_14_02_Scanner_FindingOutMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The Value of A");
		int A = sc.nextInt();
		System.out.println("The Value of B");
		int B = sc.nextInt();
		System.out.println("The value of c");
		int C = sc.nextInt();
		if (A > B && A > C) {
			System.out.println("A is max");
		} else if (B > A && B > C) {
			System.out.println("B is max");
		} else {
			System.out.println("C is max");

		}

	}

}

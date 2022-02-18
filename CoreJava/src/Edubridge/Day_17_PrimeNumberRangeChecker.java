package Edubridge;

import java.util.Scanner;

public class Day_17_PrimeNumberRangeChecker {
	public static void main(String[] args) {
		System.out.println("Enter a Number range to get Prime Number in between");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		if (number1 >= number2) {
			System.out.println("Number2 must be greater than Number1");
			System.exit(0);
		}
		while (number1 <= number2) {
			int i = 2, count = 0;
			while (i <= number1 / 2) {
				if (number1 % i == 0) {
					count++;
					break;
				}
				i++;
			}
			if (count == 0) {
				System.out.println(number1 + " is a prime Number");
			}
			number1++;
		}
	}

}

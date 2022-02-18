package Edubridge;

import java.util.Scanner;

public class Day_14_03_GradeCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		float Marks = sc.nextFloat();

		if (Marks >= 1 && Marks <= 100)
			if (Marks >= 90) {
				System.out.println("Your Grade: A-Excellent");
			} else if (90 < Marks && Marks >= 80) {
				System.out.println("Your Grade: B-Very Good");
			} else if (80 > Marks && Marks >= 70) {
				System.out.println("Your Grade: C-Good");
			} else if (70 > Marks && Marks >= 60) {
				System.out.println("Your Grade: D-Satisfactory");
			} else if (60 > Marks && Marks >= 50) {
				System.out.println("Your Grade: E-Worked Hard ");

			} else if (50 > Marks && Marks >= 40) {
				System.out.println("Your Grade: F-Just passed");
			} else if (Marks < 40) {
				System.out.println("your Grade: Failed");
			}
	}

}

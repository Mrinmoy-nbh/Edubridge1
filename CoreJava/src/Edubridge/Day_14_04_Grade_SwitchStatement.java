package Edubridge;
import java.util.Scanner;
public class Day_14_04_Grade_SwitchStatement {
	public static String findGrade(int score) {
if (score<0 || score>100)
	return "Invalid score";
//	switch-case
	switch(score/10)
	{
	case 10:
	case 9:
//		System.out.println("A");
//		break;
		return "A";
	case 8:
//	System.out.println("B");
		//break;
		return "B";
	case 7:
		return "C";
	case 6:
		return "D";
	case 5:
		return "E";
		default:
			return "F";
		
	}
	}
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Score Value: ");
	int score = sc.nextInt();
	System.out.println("Grade = " + findGrade(score));
sc.close();
}
}


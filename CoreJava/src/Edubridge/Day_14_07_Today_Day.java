package Edubridge;
import java.util.Scanner;
public class Day_14_07_Today_Day {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println(" Enter the Day Number: ");
int weekday = scan.nextInt();
switch (weekday)
{
case 1: 
	System.out.println("Monday");
	break;
case 2:
	System.out.println("tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
case 5: 
	System.out.println("Friday");
	break;
case 6: 
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
	default:
		System.out.println("Invalid");
	break;
}
	}

}

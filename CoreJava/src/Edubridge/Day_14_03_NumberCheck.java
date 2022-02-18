package Edubridge;
import java.util.Scanner;
public class Day_14_03_NumberCheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The number");
	float number = sc.nextFloat();
	if (number>0)
	{
		System.out.println("the number is posative: +"+number);
	}
	else if (number<0)
	{
		System.out.println("the number is negetive: "+number);
		
	}
	else
	{
		System.out.println("The Number is Zero.");
	}
}

}

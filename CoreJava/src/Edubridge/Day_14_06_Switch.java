package Edubridge;

import java.util.Scanner;

public class Day_14_06_Switch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	{
	
	System.out.print("Enter the Score Value: ");
	int score = sc.nextInt();
	
	{
	}

if (score<0 || score>100)
	System.out.println("Invalid score");
//	switch-case
	switch(score/10)
	{
	case 10:
	case 9:
		System.out.println("Your Grade is A");
      break;
		
	case 8:
	System.out.println("Your Grade is B");
    break;
		
	case 7:
		System.out.println("Your Grade is C");
		break;
	case 6:
		System.out.println("Your Grade is D");
		break;
	case 5:
		System.out.println("Your Grade is E");
		break;
		default:
			System.out.println("Your Grade is F");
		
	}
	}
}
}

	
	


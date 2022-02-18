package Edubridge;
import java.util.Scanner;
 public class Day_17_Reverse_Number_Loop {
 
 public static void main(String[] args) {
	int reversed =0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number which you want to Reverse: ");
int num = sc.nextInt();
while (num !=0)//get last digit from number;
	
{
int digit = num%10;
reversed = reversed * 10 + digit;
//num /= 10;
num = num/10;
}
System.out.println("Reversed Number: " + reversed);
	}

}

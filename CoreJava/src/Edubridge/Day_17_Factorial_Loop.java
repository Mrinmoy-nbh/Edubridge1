package Edubridge;
import java.util.Scanner;
public class Day_17_Factorial_Loop {
public static void main(String[] args) {

	int fact =1; int i=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number whose factorial is to be found ");
int num= sc.nextInt();
while(i<=num)
{
	fact = fact*i;
	i++; //increment i by 1
}
System.out.println("factorial of "+num+" is: "+ fact);
}

}

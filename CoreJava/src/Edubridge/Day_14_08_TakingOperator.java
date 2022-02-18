package Edubridge;
import java.util.Scanner;
public class Day_14_08_TakingOperator {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a, b;
	char op;
	System.out.println("Enter A: ");
	a = s.nextInt();
	System.out.println("Enter B: ");
    b = s.nextInt();
    System.out.println("Enter operater(+, -, *, /)");
    op = s.next().charAt(0);
    double addition = a+b;
    double subtraction = a-b;
    double multiplication = a*b;
    double division = a/b;
    switch(op)
    {
    case '+' :
    {
    	System.out.println("Total after Addition is:"+addition);
    break;	
    }
    case '-' :
    {
    	System.out.println("total after subtraction is: "+subtraction);
    break;
    }
    case '*' :
    {
    	System.out.println("Total after multiplication is:"+multiplication);
    break;
    }
    case '/' :
    {
    	System.out.println(" Total after divition: "+division);
    break;
    }
    default:
    {
    	System.out.println("Please select the proper operator");
    }
    
    }
}

}

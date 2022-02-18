package NBH;
import java.util.Scanner;
public class CWM_Percentage {
	public static void main(String[] args) {
		float math, eng, ben;
		double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the marks of math");
        math = sc.nextFloat();
        System.out.println("Enter the marks of eng");
        eng = sc.nextFloat();
        System.out.println("Enter the marks of ben");
        ben = sc.nextFloat();
        percentage = ((math + eng + ben)*300)/100;
         
        System.out.println("Percentage :"+percentage);
        
	}

}

package NBH;

import java.util.Scanner;

public class CWM_2_Kilometers{
	
public static void main(String[] args) {

System.out.println("write the Distance in KM: ");
Scanner sc = new Scanner(System.in);
float DistanceInKm = sc.nextFloat();
Double DistanceInMiles = DistanceInKm * 0.6214 ;
System.out.println("The Distance in Miles: " +DistanceInMiles);
		
		
	}
}

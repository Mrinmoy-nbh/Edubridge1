package Edubridge;
import java.util.*;

public class Day3 {

	public static void main(String[] args) {
int a=5,b=6,c=3;
b=a++;
int ans =( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);

System.out.println(c);
	}

}

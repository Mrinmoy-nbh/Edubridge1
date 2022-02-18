package Edubridge;

public class Day_17_PrimeNumberChecker02 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 11) {
			if (num % 3 == 0) {
				num++;
				continue;
			}
			System.out.println("counting..." + num);
			num++;
		}
	}
}

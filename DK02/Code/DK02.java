package Code;

import java.util.Scanner;

public class DK02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		long max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		
		System.out.print(max);
		
		sc.close();
	}

}

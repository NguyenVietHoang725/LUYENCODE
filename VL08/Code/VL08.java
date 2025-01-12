package Code;

import java.util.Scanner;

public class VL08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long sum = 0;
		for (long i = a; i <= b; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.print(sum);
		
		sc.close();
	}

}

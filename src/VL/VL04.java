package VL;

import java.util.Scanner;

public class VL04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		double sum = 0;
		for (int i = 2; i <= n; i++) {
			sum += (1.0 / i);
		}

		System.out.printf("%.4f", sum);

		sc.close();
	}

}

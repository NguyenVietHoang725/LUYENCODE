package VL;

import java.util.Scanner;

public class VL05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long sum = 1;

		for (int i = 2; i <= 3 * n + 1; i++) {
			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
		}

		System.out.print(sum);

		sc.close();
	}

}

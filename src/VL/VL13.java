package VL;

import java.util.Scanner;

public class VL13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long sum = 0;
		for (long i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (n == sum)
			System.out.print("YES");
		else
			System.out.print("NO");

		sc.close();
	}

}

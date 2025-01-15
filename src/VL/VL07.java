package VL;

import java.util.Scanner;

public class VL07 {

	public static long tinhGiaiThua(int a) {
		long gt = 1;
		for (int i = 2; i <= a; i++) {
			gt *= i;
		}

		return gt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long c = tinhGiaiThua(n) / (tinhGiaiThua(k) * (tinhGiaiThua(n - k)));

		System.out.print(c);

		sc.close();
	}

}

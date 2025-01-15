package VL;

import java.util.Scanner;

public class VL11 {

	public static boolean kiemTraSoNguyenTo(long a) {

		if (a < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		if (kiemTraSoNguyenTo(n)) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

		sc.close();
	}

}
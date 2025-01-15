package VL;

import java.util.Scanner;

public class VL12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		n = Math.abs(n);

		if (n == 0)
			System.out.print("INF");
		else
			for (int i = n; i > 0; i--) {
				if (n % i == 0) {
					System.out.print(i + " ");
				}
			}

		sc.close();
	}

}

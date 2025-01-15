package DK;

import java.util.Scanner;

public class DK05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long n_can = (long) Math.sqrt(n);
		if (n_can * n_can == n)
			System.out.print("YES");
		else
			System.out.print("NO");

		sc.close();
	}

}

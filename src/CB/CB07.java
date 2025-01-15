package CB;

import java.util.Scanner;

public class CB07 {

	public static void main(String[] args) {
		final double PI = 3.14;

		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		System.out.printf("%.3f %.3f", 2 * PI * r, PI * r * r);

		sc.close();
	}

}

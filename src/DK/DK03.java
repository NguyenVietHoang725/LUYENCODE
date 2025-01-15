package DK;

import java.util.Scanner;

public class DK03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = Math.abs(a - b);
		System.out.println(result);

		sc.close();
	}
}

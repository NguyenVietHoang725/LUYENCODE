package Code;

import java.util.Scanner;

public class CB08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		sc.close();
	}

}

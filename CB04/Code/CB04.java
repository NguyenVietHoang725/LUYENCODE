package Code;

import java.util.Scanner;

public class CB04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		if (b == 0) System.out.print("ERROR");
		else System.out.printf("%.2f", a * 1.0 / b);
		
		sc.close();
	}
}

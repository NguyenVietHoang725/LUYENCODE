package DK;

import java.util.Scanner;

public class DK08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		char op = sc.next().charAt(0);
		double b = sc.nextDouble();

		if (op == '+')
			System.out.printf("%.2f", a + b);
		else if (op == '-')
			System.out.printf("%.2f", a - b);
		else if (op == '*')
			System.out.printf("%.2f", a * b);
		else if (op == '/') {
			if (b != 0)
				System.out.printf("%.2f", a / b);
			else
				System.out.print("Math Error");
		}

		sc.close();
	}

}

package Code;

import java.util.Scanner;

public class DK07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0) System.out.print("WOW");
				else System.out.print("NO");
			} else {
				System.out.printf("%.2f", -1.0 * c / b);
			}
		} else {
			double delta = b*b - 4*a*c;
			if (delta < 0) System.out.print("NO");
			else if (delta == 0) System.out.printf("%.2f", -1.0 * b / (2 * a));
			else System.out.printf("%.2f %.2f", ((-b - Math.sqrt(delta)) / (2*a)), (-b + Math.sqrt(delta)) / (2*a));
		}
		
		sc.close();
	}

}

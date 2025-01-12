package Code;

import java.util.Scanner;

public class VL09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		int n = sc.nextInt();
		
		double s = x, ms = 1;
		
		for (int i = 2; i <= n; i++) {
			ms *= i;
			s += Math.pow(x, i) / ms;
		}
		
		System.out.printf("%.2f", s);
		
		sc.close();
	}

}

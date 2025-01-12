package Code;

import java.util.Scanner;

public class VL03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long sum = 2 * n;
		
		for (int i = 2; i <= n; i++) {
			sum += i;
		}
		
		System.out.print(sum);
		
		sc.close();
	}

}

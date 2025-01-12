package Code;

import java.util.Scanner;

public class GT1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long gt = 1;
		for (int i = 2; i <= n; i++) {
			gt *= i;
		}
		
		System.out.print(gt);
		
		sc.close();
	}

}

package Code;

import java.util.Scanner;

public class CB06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println((r + d) * 2);
		System.out.print(r * d);
		
		sc.close();
	}

}

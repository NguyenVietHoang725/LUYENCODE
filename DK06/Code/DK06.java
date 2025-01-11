package Code;

import java.util.Scanner;

public class DK06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a == 0 && b != 0) System.out.print("NO");
		else if (a == 0 && b == 0) System.out.print("WOW");
		else System.out.printf("%.2f", -1.0 * b / a);
		
		sc.close();
	}

}

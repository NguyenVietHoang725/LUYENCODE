package Code;

import java.util.Scanner;

public class DK01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) System.out.print(a);
		else System.out.print(b);
		
		sc.close();
	}

}

package Code;

import java.util.Scanner;

public class DK09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if (0 < year && year < 100000) {
			if ((year % 400 == 0) || ((year % 4 == 0) && year % 100 != 0)) {
				System.out.print("YES");
			} else {
				System.out.print("NO");
			}
		} else {
			System.out.print("INVALID");
		}
		
		sc.close();
	}

}

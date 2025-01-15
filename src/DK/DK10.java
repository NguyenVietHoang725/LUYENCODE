package DK;

import java.util.Scanner;

public class DK10 {

	public static boolean kiemTraNamNhuan(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();

		if ((year > 0 && year < 10000) && (month > 0 && month <= 12)) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("30");
				break;
			case 2:
				if (kiemTraNamNhuan(year))
					System.out.print("29");
				else
					System.out.print("28");
				break;
			}
		} else {
			System.out.print("INVALID");
		}

		sc.close();
	}

}

package Code;

import java.util.Scanner;

public class VL10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		long cnt = num.length();
		
		if (num.charAt(0) == '-') {
			cnt -= 1;
			System.out.print(cnt);
		}
		else System.out.print(cnt);
		
		sc.close();
	}

}

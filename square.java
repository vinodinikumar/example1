package Logic;

import java.util.Scanner;

public class MakeSquare {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		String a1 = s.next();
		String b[] = s1.split(",");
		boolean k = false;
		if (b.length == 8) {
			if (b[0].equals(b[2]) && b[4].equals(b[6]) && b[1].equals(b[7]) && b[3].equals(b[5])) {
				k = true;
			}
		}
		if (k) {
			System.out.println("yes");

		} else {
			System.out.println("No");
		}

	}
}

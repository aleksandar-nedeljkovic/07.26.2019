package cetvrtipaket;

import java.util.Scanner;

public class CetvrtiDomaciZadatak5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesi stranicu kvadrata: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print("x");
			}
			System.out.println();
		}

	}

}

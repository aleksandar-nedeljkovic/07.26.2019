package cetvrtipaket;

import java.util.Scanner;

public class CetvrtiDomaciZadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double poz = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Unesi " + i + ". broj: ");
			n = sc.nextInt();
			if (n > 0)
				poz = poz + n;
			if (n < 0) {
				int neg = 0;
				n = neg;
			}

		}
		System.out.println("Suma pozitivnih brojeva je: " + poz);

	}

}

package application;

import java.util.Scanner;

public class Cachorro_quente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int H = sc.nextInt();
		int P = sc.nextInt();
		double numMedio=(double)H/P;
		System.out.printf("%.2f", numMedio);

	}

}

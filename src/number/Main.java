package number;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();

		System.out.println();
		System.out.println("Quantidade de dígitos: " + NumberUtils.countDigits(num));
		System.out.println("Invertido: " + NumberUtils.reverse(num));
		System.out.println("Soma dos dígitos: " + NumberUtils.sumDigits(num));		
		System.out.println("Divisível por: " + NumberUtils.getDiv(num));
		System.out.println("Capícua: " + NumberUtils.checkCapicua(num));
		System.out.println("Primo: " + NumberUtils.checkPrime(num));
		
		sc.close();
	}
}

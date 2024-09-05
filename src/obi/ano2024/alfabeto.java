package obi.ano2024;

import java.util.Scanner;

public class alfabeto {
	public static void main(String[] atgs) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		String alfabeto = sc.nextLine();
		String texto = sc.nextLine();

		sc.close();

		for(int i = 0; i < n; i++) {
			if(!alfabeto.contains(String.valueOf(texto.charAt(i)))) {
				System.out.println("N");
			}
		}
			  
		System.out.println("S");
	}
}
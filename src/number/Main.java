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
		System.out.println("Divisível por: " + divArrayToString(NumberUtils.getDivList(num)));
		System.out.println("Capícua: " + NumberUtils.checkCapicua(num));
		System.out.println("Primo: " + NumberUtils.checkPrime(num));
		
		sc.close();
	}
	
	private static String divArrayToString(byte[] divArray) {
		String str = "";
		byte length = (byte) divArray.length;
		for(byte i = 0; i < length; i++) {
			if(i == length - 1) {
				str = str + divArray[i] + ". (" + length + " divisores)";
			} else {
				str = str + divArray[i] + ", ";				
			}
		}
		return str;
	}
}

package number;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();

		System.out.println();
		System.out.println("Quantidade de dígitos: " + NumberUtils.countDigits(num));
		System.out.println("Invertido: " + NumberUtils.reverse(num));
		System.out.println("Soma dos dígitos: " + NumberUtils.sumDigits(num));		
		System.out.println("Divisível por: " + getDiv(num));
		System.out.println("Capícua: " + NumberUtils.checkCapicua(num));
		System.out.println("Primo: " + NumberUtils.checkPrime(num));
		
		sc.close();
	}
	
	public static ArrayList<Byte> getDiv(long num) {
		ArrayList<Byte> divArray = new ArrayList<>();
		divArray.add((byte) 1);
		
		if(NumberUtils.divBy2(num)) { divArray.add((byte) 2); }
		if(NumberUtils.divBy3(num)) { divArray.add((byte) 3); }
		if(NumberUtils.divBy4(num)) { divArray.add((byte) 4); }
		if(NumberUtils.divBy5(num)) { divArray.add((byte) 5); }
		if(NumberUtils.divBy6(num)) { divArray.add((byte) 6); }
		if(NumberUtils.divBy7(num)) { divArray.add((byte) 7); }
		if(NumberUtils.divBy8(num)) { divArray.add((byte) 8); }
		if(NumberUtils.divBy9(num)) { divArray.add((byte) 9); }
		if(NumberUtils.divBy10(num)) { divArray.add((byte) 10); }
		
		return divArray;
	}
}

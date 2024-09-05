package obi.ano2007;

import java.util.Scanner;

public class choc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int pedacos = 0;
		
		for(int i = 0; i < n; i++) {
			pedacos += sc.nextInt()-1;
		}
	
		sc.close();
		System.out.println(pedacos);
	}
}

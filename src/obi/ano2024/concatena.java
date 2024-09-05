package obi.ano2024;

import java.util.Scanner;

public class concatena {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int[] lista = new int[n];
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num < 1 || num > 9) return;
			lista[i] = num;
		}
		
		int[] resp = new int[q];
		
		for(int i = 0; i < q; i++) {
			int comeco = sc.nextInt() -1;
			int fim = sc.nextInt() -1;
			
			int[] seq = new int[fim-comeco+1];
			int k = 0;
			for(int j = comeco; j <= fim; j++) {
				seq[k] = lista[j];
				k++;
			}
			
			int potencial = 0;
			for(int j = 0; j <= fim-comeco; j++) {
				for(k = 0; k <= fim-comeco; k++) {
				    if(k != j) {
					    potencial += seq[j]*10 + seq[k];
				    }
				}
			}
			resp[i] = potencial;
		}
		
		sc.close();
		
		for(int i = 0; i < q; i++) {
			System.out.println(resp[i]);
		}
	}
}

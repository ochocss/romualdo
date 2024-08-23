package obi.ano2006;

import java.util.Scanner;

public class caju {
    private static void aprint(int[][] matriz, int l, int c) {
        System.out.print("\n");
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lin = sc.nextInt();
        int col = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[lin][col];

        for(int i = 0; i < lin; i++) {
            for(int j = 0; j < col; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int maior = 0;

        for(int i = 0; i <= lin - m; i++) {
            for(int j = 0; j <= col - n; j++) {
                int sum = 0;

                for(int x = 0; x < m; x++) {
                    for(int y = 0; y < n; y++) {
                        sum += matriz[i + x][j + y];
                    }
                }

                if(sum > maior) {
                    maior = sum;
                }
            }
        }
        System.out.println(maior);
    }
}
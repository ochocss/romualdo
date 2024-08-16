package obi;

import java.util.Arrays;
import java.util.Scanner;

class matriz {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        String[] inputStrs = sc.nextLine().split(" ");

        int lin = Integer.parseInt(inputStrs[0]);
        int col = Integer.parseInt(inputStrs[1]);

        int[][] matriz = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            String[] strs = sc.nextLine().split(" ");

            for (int j = 0; j < col; j++) {
                for(String numStr : strs) {
                    matriz[i][j] = Integer.parseInt(numStr);
                }
            }
        } //read

        if(matriz[lin-1][col-1] + matriz[0][0] <= matriz[lin-1][1] + matriz[1][col-1]) {
            count++;
        }

        System.out.println(Arrays.deepToString(matriz));
    }
}
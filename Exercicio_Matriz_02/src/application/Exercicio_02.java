package application;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Informe a quantidade de linhas : ");
		int lin = sc.nextInt();
		System.out.print("Informe a quantidade de colunas : ");
		int cln = sc.nextInt();
		
		int[][] mat = new int [lin][cln];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println();
		System.out.print("Informe o numero que deseja buscar : ");
		int numeroDaBusca = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == numeroDaBusca) {
					System.out.println("Position : " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left : " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up : " + mat[i - 1] [j]);
					}
					if (j < mat[i].length - 1 ) {
						System.out.println("Right : " + mat[i][j + 1]);
				
					}
					if (i < mat.length - 1) {
						System.out.println("Down : " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
		

	}

}

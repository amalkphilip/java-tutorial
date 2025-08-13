package java_tutorial;

import java.util.Scanner;
public class matrixAddtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row :");
		int r1 =sc.nextInt();
		System.out.print("Enter the Column :");
		int c1 =sc.nextInt();
		int[][] matrix1 = new int[r1][c1];
		for(int i = 0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print("Enter the Element");
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the Row :");
		int r2 =sc.nextInt();
		System.out.print("Enter the Column :");
		int c2 =sc.nextInt();
		int [][] matrix2 = new int[r2][c2];
		for(int i = 0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print("Enter the Element");
				matrix2[i][j]=sc.nextInt();
			}
		}
		int [][] add = new int[r1][c1];
		if (r1==r2 && c1==c2) {
			for(int i = 0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					add[i][j]=matrix1[i][j]+matrix2[i][j];
				}
			}
			System.out.println("The Sum of Two Matrix :");
			for(int i = 0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					System.out.print(add[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else {
			System.out.print("The rows and the columns are not same to the marix2");
		}
	}

}

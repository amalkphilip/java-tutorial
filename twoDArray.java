package java_tutorial;

import java.util.Scanner;
public class twoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row :");
		int r =sc.nextInt();
		System.out.print("Enter the Column :");
		int c =sc.nextInt();
		int[][] matrix = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				System.out.print("Enter the value : ");
				matrix[i][j] = sc.nextInt();
				
			}
		
		}
		
		for(int i=0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				System.out.print(matrix[i][j]+"\t");
				
				
			}
			System.out.println();
		
		}
	}

}

import java.util.Scanner;
public class copyMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row size of Matrix :");
		int r = sc.nextInt();
		System.out.print("Enter the Column size of Matrix :");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		int [][] copy = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("Enter the Elemet :");
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("MAIN MATRIX ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				copy[i][j]=matrix[i][j];
			}
		}
		
		System.out.println("COPIED MATRIX ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(copy[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

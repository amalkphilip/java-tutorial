import java.util.Scanner;
public class First_N_Natural_No {
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the limit:");
		int limit = obj.nextInt();
		for(int i=1;i<=limit;i++) {
			System.out.println(i+"\t");
			
		}
	}
}

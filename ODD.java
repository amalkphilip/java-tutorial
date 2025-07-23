import java.util.Scanner;
public class OddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the RANGE for DISPLAY the ODD number");
		int limit = sc.nextInt();
		for(int i=0;i<=limit;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}

import java.util.Scanner;
public class GRADE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark :");
		int Mark = sc.nextInt();
		if(Mark>=90) {
			System.out.println("Grade A");
		}
		else if(Mark>=75) {
			System.out.println("Grade B");
		}
		else if(Mark>=60) {
			System.out.println("Grade C");
		}
		else if(Mark>=40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Failed");
		}
	}

}

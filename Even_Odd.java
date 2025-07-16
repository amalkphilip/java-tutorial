import java.util.Scanner;
public class Even_Odd {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = obj.nextInt();
		if(number%2==0) {
			System.out.println("The "+number+" Number is Even.");
		}
		else {
			System.out.println("The "+number+" Number is Odd.");
		}
	}

}

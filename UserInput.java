import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		System.out.println("Name is "+name);
		System.out.println("Roll number is "+number);
	}
}

import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int FirstNo = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int SecondNo = sc.nextInt();
		System.out.println("Enter the Symbol(+,-,*,/):");
		char ch = sc.next().charAt(0);
		if( ch =='+') {
			int add = FirstNo + SecondNo;
			System.out.println("The Sum of Two number is "+add);
		}
		else if( ch =='-') {
			int diff = FirstNo - SecondNo;
			System.out.println("The Difference of Two number is "+diff);
		}
		else if( ch =='*') {
			int pro = FirstNo * SecondNo;
			System.out.println("The Product of Two number is "+pro);
		}
		else {
			if(SecondNo==0) {
				System.out.println("The Second number is Zero.");
			}
			else {
			int div = FirstNo / SecondNo;
			System.out.println("The Difference of Two number is "+div);}
		}
	}
}

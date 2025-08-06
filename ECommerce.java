import java.util.Scanner;

class PaymentGateway{
	
	public void makePayment(int cardNumber,String expiryDate,int cvv) {
		System.out.println("Credit Card Payment was SUCCESFUL from "+cardNumber);
	}
	
	public void makePayment(String upid) {
		System.out.println("UPI PAYMENT WAS SUCCESFUL. ");
	}
	public void makePayment(double amount) {
		System.out.println("PAYMENT ON DELIVERY WAS SUCCESFUL. ");
	}
}

public class ECommerce {
	public static void main(String[] args) {
		PaymentGateway pgw = new PaymentGateway();
		Scanner sc = new Scanner(System.in);
		System.out.println("choose your Favourable Payment...");
		System.out.println("1 .CREDIT CARD.");
		System.out.println("2 .UPI METHOD.");
		System.out.println("3 .CASH ON DELIVERY.");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:{
			System.out.println("Enter the Card number :");
			int cardNumber = sc.nextInt();
			System.out.println("Enter the Expiry Date :");
			String expiryDate = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the CVV Code :");
			int cvv = sc.nextInt();
			pgw.makePayment(cardNumber, expiryDate, cvv);
			break;
		}
		case 2:{
			System.out.println("Enter the UPI number :");
			String upi = sc.nextLine();
			sc.nextLine();
			pgw.makePayment(upi);
			break;
		}
		case 3:{
			System.out.println("Enter the Amount :");
			Double amount = sc.nextDouble();
			pgw.makePayment(amount);
			break;
		}
		default :{
			System.out.println("Invalid");
		}
		
		}
		sc.close();
		
	}
}

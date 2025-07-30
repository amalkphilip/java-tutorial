import java.util.Scanner;

class PaymentGateway{
	
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Credit Card Payment was SUCCESFULLY from "+cardNumber);
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
		
	}
}

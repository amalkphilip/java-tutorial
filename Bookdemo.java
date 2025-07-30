class Book{
	String title;
	String author;
	double price;
	int remain;
	double total;
	
	Book(String title,String author,double price,int remain){
		this.title = title;
		this.author = author;
		this.price = price;
		this.remain = remain;
		this.total = remain*price;
	}
	
	
	public void displayDetails() {
		System.out.println("Title of the Book :"+title);
		System.out.println("Author of the Book :"+author);
		System.out.println("Price for the Book :"+price+" INR");
		System.out.println("Books remaining :"+remain);
		System.out.println("Total price of the Book :"+total+" INR");
	
	}
}

public class BookDemo {
	public static void main(String[] args) {
		Book bo1 = new Book("Harry Potter","J K Rowling",1200,4);
		Book bo2 = new Book("Wings Of Fire","Tui .T. Sutherland",750,8);
		bo1.displayDetails();
		System.out.println(" ");
		bo2.displayDetails();
		}
}

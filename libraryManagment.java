

class Library{
	String title;
	String author;
	static int counter=1000;
	final int bookID;
	static final  String LIBRARY_NAME ="CENTRAL LIBRARY";
	Library(){
		title="UNDECLARED";
		author="UNDEFINED";
		counter++;
		this.bookID=counter;
	}
	Library(String title,String author){
		this.title=title;
		this.author=author;
		counter++;
		this.bookID=counter;
	}
	
	public void displayInfo() {
		System.out.println("TITLE OF THE BOOK :"+title);
		System.out.println("AUTHOR OF THE BOOK  :"+author);
		System.out.println("ID OF THE BOOK :"+bookID);
		System.out.println(counter+"th BOOK");
	}
	public boolean displayInfo(boolean LIBRARY_NAME){
		if(LIBRARY_NAME==true) {
		System.out.println("LIBRARY NAME - "+LIBRARY_NAME);
		
		}
		return false;
	}
	
}


public class libraryManagement {
	public static void main(String[] args) {
		Library lb1 = new Library();
		Library lb2 = new Library("title","author");
		Library lb3 = new Library();
		lb1.displayInfo();
		lb1.displayInfo(false);
		lb2.displayInfo();
		lb2.displayInfo(true);
		lb3.displayInfo();
		lb3.displayInfo(false);
		
	}
}

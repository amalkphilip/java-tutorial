package java_tutorial;

class Library{
	String title;
	String author;
	static int counter=1000;
	final int bookID;
	static final  String LIBRARY_NAME ="CENTRAL LIBRARY";
	Library(){
		this.title="UNDECLARED";
		this.author="UNDEFINED";
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
	
}


public class libraryManagement {

}

class Library{
	String title;
	String author;
	static int counter=1000;
	final int bookID;
	static final  String LIBRARY_NAME ="CENTRAL LIBRARY";
	Library(){
		this.title="UNDECLARED";
		this.author="UNDEFINED";
	}
	Library(String title,String author){
		this.title=title;
		this.author=author;
		counter++;
	}
}


public class library {

}

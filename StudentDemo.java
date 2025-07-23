import java.util.Scanner;
class Student{
	String Name;
	int Age;

	public void DisplayDetails() {
		System.out.println("The Name of the Student: "+Name);
		System.out.println("The Age of the Student: "+Age);
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Student student = new Student();

	        System.out.print("Enter name: ");
	        student.Name = scanner.nextLine();

	        System.out.print("Enter age: ");
	        student.Age = scanner.nextInt();
		student.DisplayDetails();
	}
}

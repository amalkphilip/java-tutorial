import java.util.Scanner;

class Employee{
	String Name;
	int Id;
	double Salary;
public void DisplayEmployee(){
	System.out.println("The Name of the Employee :"+Name);
	System.out.println("The ID :"+Id);
	System.out.println("The Salary : "+Salary);
}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee ep = new Employee();
		System.out.println("Enter the name :");
		ep.Name = sc.nextLine();
		System.out.println("Enter the ID :");
		ep.Id = sc.nextInt();
		System.out.println("Enter the Salary :");
		ep.Salary = sc.nextInt();
		ep.DisplayEmployee();
	}
}

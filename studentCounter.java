class Student{
	String Name;
	static int counter=0;
	Student(String Name) {
		this.Name=Name;
		counter++;
	}
	
	public static int  getStudentCount() {
		return counter;
	}
}

public class studentCounter {
	public static void main(String[] args) {
		Student st1 = new Student("Amal");
		Student st2 = new Student("levin");
		Student st3 = new Student("joe");
		Student st4 = new Student("joshil");
		int total= Student.getStudentCount();
		System.out.println("Number of Student :"+total);
	}
}

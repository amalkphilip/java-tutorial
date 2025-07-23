import java.util.Scanner;
public class WEEK {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer (1 to 7)for the day in a week");
		int Day = sc.nextInt();
		switch(Day) {
		case 1:
			System.out.println("DAY : MONDAY");
			break;
		case 2:
			System.out.println("DAY : TUESDAY");
			break;
		case 3:
			System.out.println("DAY : WENESDAY");
			break;
		case 4:
			System.out.println("DAY : THUSEDAY");
			break;
		case 5:
			System.out.println("DAY : FRIDAY");
			break ;
		case 6:
			System.out.println("DAY : SATURDAY");
			break;
		case 7:
			System.out.println("DAY : SUNDAY");
			break;
		default:
			System.out.println("INPUT IS OUT OF RANGE.");
		}
	}
}

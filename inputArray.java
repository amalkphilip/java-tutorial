import java.util.Scanner;
public class inputArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE SIZE OF THE ARRAY : ");
		int m= sc.nextInt();
		int[] anArray= new int[m];
		//adding the values to array
		for (int j=0;j<m;j++) {
			System.out.print("Enter the element :");
			anArray[j] = sc.nextInt();
		}
		//display
		System.out.println("Length of the ARRAY : "+anArray.length);
		System.out.println("Values inside the Array:\n");
		for(int i=0;i<anArray.length;i++) {
			System.out.print(anArray[i]+"\t");
		}
		
	}

}

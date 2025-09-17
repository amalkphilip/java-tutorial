
//Introduction to Exception..
public class exceptionDemo {
	public static void main(String[] args) {
		try {
		//IndexOutOfBoundsException
		
		String s3 = "SJCET";
		System.out.println(s3.charAt(10));
		
		int [] array = {1,2,3,4,5};
		System.out.println(array[6]);
		
		//NumberFormatException
		
		String s2 = "abc";
		System.out.println(Integer.parseInt(s2));
		
		//Null Exception
		
		String s1 = null;
		System.out.println(s1.length());
		
		//Arithmetic Exception
		
		System.out.println(10/0);
		}
		catch (ArithmeticException ae){
			System.out.println("Arithmetic Exception found");
	}
		catch (NumberFormatException ne) {
			System.out.println("NumberFormatException Error Found.");
		}
		catch (IndexOutOfBoundsException ie) {
			System.out.println("IndexOutOfBoundsException Error Found.");
		}
		System.out.println("After Exception..");
	}
}

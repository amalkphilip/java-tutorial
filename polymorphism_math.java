
class Shape{
	public int area(int a,int b) {
		System.out.println("THe shape is rectangle.");
		return a*b;
		
	}
	public int area(int side) {
		System.out.println("The Shape is square.");
		return side*side;
	}
	public float area(float radius) {
		System.out.println("The Shape is Circle.");
		return 3.14f*radius*radius;
	}
}


public class overloading {
	public static void main(String[] args) {
		Shape sh = new Shape();
		
		System.out.println(sh.area(9.0f));
		
		System.out.println(sh.area(53));
		
		System.out.println(sh.area(8,3));
	}

}

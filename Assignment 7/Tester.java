
public class Tester {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		r1.width = 25.5;
		r1.length = 1.00;
		
		r2.width = 2.5;
		r2.length = 1.5;
		
		r3.width = 5.5;
		r3.length = 2.0;
		
		System.out.print("So, The Area of Rectangle 1 is: "+r1.getArea());
		System.out.print("\n\n");
		System.out.print("So, The Area of Rectangle 2 is: "+r2.getArea());
		System.out.print("\n\n");
		System.out.print("So, The Area of Rectangle 3 is: "+r3.getArea());
	}

}

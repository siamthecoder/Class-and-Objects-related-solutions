
public class Driver {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.width = 4.00;
		box1.height = 5.00;
		box1.depth = 9.00;
		
		box2.width = 3.00;
		box2.height = 6.00;
		box2.depth = 10.00;
		
		box3.width = 2.00;
		box3.height = 9.00;
		box3.depth = 12.00;
		
		System.out.print("So, The Volume of Box 1 is: "+box1.volume());
		System.out.print("\n\n");
		System.out.print("So, The Volume of Box 2 is: "+box2.volume());
		System.out.print("\n\n");
		System.out.print("So, The Volume of Box 3 is: "+box3.volume());

	}

}


public class Box {
	//data fields
	double width;
	double height;
	double depth;
	
	Box() {
		this.width = 1.00;
		this.height = 1.00;
		this.depth = 1.00;
	}
	
	public double volume() {
		System.out.println("Here,");
		System.out.println("Width is: "+this.width);
		System.out.println("Height is: "+this.height);
		System.out.println("Depth is: "+this.depth);
		
		return (width * height * depth);
	}
}

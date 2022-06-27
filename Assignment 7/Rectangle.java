
public class Rectangle {
	//data fields
	double width;
	double length;
	
	Rectangle() {
		this.width = 1.00;
		this.length = 1.00;
	}
	
	public double getArea() {
		System.out.println("Here,");
		System.out.println("Width is: "+this.width);
		System.out.println("Length is: "+this.length);
		
		return (width * length);
	}
}

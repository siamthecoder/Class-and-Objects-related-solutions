
public class Rectangle extends Shape implements Geometric{
	private double length;
	private double width;
	
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	public double getPerimeter() {
		double rP = (length + width) * 2.0;
		return rP;
	}

	@Override
	public double getArea() {
		double rA = length * width;
		return rA;
	}
	
	
}
